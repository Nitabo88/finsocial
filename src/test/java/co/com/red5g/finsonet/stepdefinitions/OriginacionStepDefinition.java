package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.questions.QueElChequeoDeDocumentos;
import co.com.red5g.finsonet.tasks.Completar;
import co.com.red5g.finsonet.tasks.Estado;
import co.com.red5g.finsonet.tasks.Realizar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builder.ChequeoDocumentoBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class OriginacionStepDefinition {

    @Dado("^que (.*) quiere realizar el chequeo de un documento$")
    public void IngresarChequeo(String actor) {
        theActorCalled(actor).attemptsTo(
                Realizar.unChequeoDeDocumento()
        );
    }

    @Cuando("^el asesor decline el chequeo del credito del cliente$")
    public void rechazarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(Estado.ubicarseConDocumento());
    }

    @Entonces("^el asesor no deberia verlo en chequeo de documentos$")
    public void elAsesorNoDeberiaVerloEnChequeoDeDocumentos() {
        theActorInTheSpotlight().should(seeThat(co.com.red5g.finsonet.questions.Estado.noVisible()));
    }

    @Cuando("^el asesor complete el chequeo de credito del cliente$")
    public void diligenciarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(
                Completar.ElChequeoDeDocumentos(con().centralesDeRiesgo())
        );
    }

    @Entonces("^deberia ver el mensaje de adjuntar informacion$")
    public void verificarNoCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(QueElChequeoDeDocumentos.noSeGuardo(), containsString("Para poder continuar es necesario diligenciar")));
    }
}
