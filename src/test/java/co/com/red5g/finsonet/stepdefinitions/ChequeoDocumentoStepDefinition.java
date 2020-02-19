package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazado.MENSAJE_CREDITO_RECHAZADO;
import static co.com.red5g.finsonet.exceptions.NoSeVeElCredito.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazado;
import co.com.red5g.finsonet.exceptions.NoSeVeElCredito;
import co.com.red5g.finsonet.questions.QueAparece;
import co.com.red5g.finsonet.questions.QueElChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.QueNoAparece;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.Realizar;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class ChequeoDocumentoStepDefinition {

    private static final String ESTADO_NO_EXITOSO = "Para poder continuar es necesario diligenciar";

    @Dado("^que (.*) esta en el paso de chequeo de un documentos$")
    public void IngresarChequeo(final String actor) {
        theActorCalled(actor).attemptsTo(
            Realizar.unChequeoDeDocumento()
        );
    }

    @Cuando("^el asesor decline el chequeo del credito del cliente$")
    public void rechazarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.elRechazoDelCredito(con().motivo())
        );
    }

    @Entonces("^el asesor no deberia verlo en chequeo de documentos$")
    public void elAsesorNoDeberiaVerloEnChequeoDeDocumentos() {
        theActorInTheSpotlight().should(seeThat(QueNoAparece.laSolicitud(), equalTo(false)).orComplainWith(ElCreditoNoFueRechazado.class, MENSAJE_CREDITO_RECHAZADO));
    }

    @Cuando("^el asesor complete el chequeo de credito del cliente$")
    public void diligenciarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(
            Diligencia.laInformacionIncompletaDeChequeoDeDocumentos(con().centralesDeRiesgo())
        );
    }

    @Entonces("^deberia ver el mensaje de adjuntar informacion$")
    public void verificarNoCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(QueElChequeoDeDocumentos.noSeGuardo(), containsString(ChequeoDocumentoStepDefinition.ESTADO_NO_EXITOSO)));
    }

    @Cuando("^el asesor adjunta toda la informacion de el chequeo de documentos$")
    public void adjuntarDocumentos() {
        theActorInTheSpotlight().attemptsTo(
            Diligencia.laInformacionDeChequeoDeDocumentos(con().centralesDeRiesgo())
        );
    }

    @Entonces("^deberia ver el credito en el paso de confirmacion$")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacion()).orComplainWith(NoSeVeElCredito.class, MENSAJE_CREDITO));
    }

    @Y("^el auxiliar de documentacion deberia verlo$")
    public void verificarRevisionDocumentacion() {
        theActorInTheSpotlight().attemptsTo(Ingresa.conUsuarioDeDocumentacion());
        theActorInTheSpotlight().should(seeThat(QueAparece.laSolicitudPendiente()).orComplainWith(ElCreditoNoFueRechazado.class, MENSAJE_CREDITO_RECHAZADO));
    }
}