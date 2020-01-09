package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazado.MENSAJE_CREDITO_RECHAZADO;
import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.exceptions.ElCreditoNoFueRechazado;
import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException;
import co.com.red5g.finsonet.questions.ElCredito;
import co.com.red5g.finsonet.questions.QueElChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.QueNoAparece;
import co.com.red5g.finsonet.tasks.Estado;
import co.com.red5g.finsonet.tasks.ListadoDocumentos;
import co.com.red5g.finsonet.tasks.Realizar;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ChequeoDocumentoStepDefinition {
    private static final String ESTADO_NO_EXITOSO = "Para poder continuar es necesario diligenciar";


    @Dado("^que (.*) quiere realizar el chequeo de un documento$")
    public void IngresarChequeo(String actor) {
        theActorCalled(actor).attemptsTo(
                Realizar.unChequeoDeDocumento()
        );
    }

    @Cuando("^el asesor decline el chequeo del credito del cliente$")
    public void rechazarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(Estado.ubicarseConDocumento(),
                ListadoDocumentos.llenar(con().motivo())
                );
    }

    @Entonces("^el asesor no deberia verlo en chequeo de documentos$")
    public void elAsesorNoDeberiaVerloEnChequeoDeDocumentos() {
        theActorInTheSpotlight().should(seeThat(QueNoAparece.laSolicitud()).orComplainWith(ElCreditoNoFueRechazado.class, MENSAJE_CREDITO_RECHAZADO));
    }

    @Cuando("^el asesor complete el chequeo de credito del cliente$")
    public void diligenciarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(
                Diligencia.laInformacionIncompletaDeChequeoDeDocumentos(con().centralesDeRiesgo())
        );
    }

    @Entonces("^deberia ver el mensaje de adjuntar informacion$")
    public void verificarNoCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(QueElChequeoDeDocumentos.noSeGuardo(), containsString(ESTADO_NO_EXITOSO)));
    }

    @Cuando("^el asesor adjunta toda la informacion de el chequeo de documentos$")
    public void adjuntarDocumentos() {
        theActorInTheSpotlight().attemptsTo(
                Diligencia.laInformacionDeChequeoDeDocumentos(con().centralesDeRiesgo())
        );
    }

    @Entonces("^deberia ver el credito en el paso de confirmacion$")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacion()).orComplainWith(NoSeVeElCreditoCreadoException.class, MENSAJE_CREDITO));
    }
}