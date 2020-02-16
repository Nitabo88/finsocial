package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class GestionLlamadasStepDefinition {

    @Dado("que un (.*) quiere asignar una llamada para el credito")
    public void queUnAsesorQuiereAsignarUnaLlamadaParaElCredito(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Ubicarse.enLlamada()
        );
    }

    @Cuando("^el realiza el proceso de asignacion$")
    public void elRealizaElProcesoDeAsignacion() {
    }

    @Y("^procesa la llamada$")
    public void procesaLaLlamada() {

    }

    @Entonces("^el credito quedara confirmado$")
    public void elCreditoQuedaraConfirmado() {
    }
}
