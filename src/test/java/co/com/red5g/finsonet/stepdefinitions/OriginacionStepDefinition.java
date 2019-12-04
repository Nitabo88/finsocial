package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.models.builder.ChequeoDocumentoBuilder;
import co.com.red5g.finsonet.tasks.Completar;
import co.com.red5g.finsonet.tasks.Realizar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OriginacionStepDefinition {


    @Dado("^que (.*) quiere realizar el chequeo de un documento$")
    public void IngresarChequeo(String actor) {
        theActorCalled(actor).attemptsTo(
                Realizar.unChequeoDeDocumento()
        );
    }


    @Cuando("^el asesor decline el chequeo del credito del cliente con cedula (\\d+)$")
    public void elAsesorDeclineElChequeoDelCreditoDelClienteConCedula(int arg1) {

    }

    @Entonces("^el asesor no deberia verlo en chequeo de documentos$")
    public void elAsesorNoDeberiaVerloEnChequeoDeDocumentos() {

    }

    @Cuando("^el asesor complete el chequeo de credito del cliente$")
    public void diligenciarChequeoDocumentos() {
        theActorInTheSpotlight().attemptsTo(
                Completar.ElChequeoDeDocumentos(ChequeoDocumentoBuilder.con().centralesDeRiesgo())
        );

    }

    @Entonces("^deberia ver el mensaje de adjuntar informacion$")
    public void verificarNoCreacionCredito() {

    }

}
