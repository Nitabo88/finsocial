package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.ValidarLlamada;
import co.com.red5g.finsonet.tasks.AsignacionLlamadas;
import co.com.red5g.finsonet.tasks.SeProcesa;
import co.com.red5g.finsonet.tasks.SeValida;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class LlamadasStepDefinition {

    private static final String ESTADO_COMPLETO = "Visto bueno";

    @Dado("que un (.*) quiere asignar una llamada para el credito")
    public void queUnAsesorQuiereAsignarUnaLlamadaParaElCredito(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
            Ubicarse.enLlamada()
        );
    }

    @Cuando("el realiza el proceso de asignacion")
    public void elRealizaElProcesoDeAsignacion() {
        theActorInTheSpotlight().attemptsTo(
            AsignacionLlamadas.asignarllamada()
        );
    }

    @Y("^procesa la llamada$")
    public void procesaLaLlamada() {
        theActorInTheSpotlight().attemptsTo(
            SeProcesa.laLlamada()
        );
    }

    @Entonces("^la gestion quedara confirmado$")
    public void elCreditoQuedaraConfirmado() {
        theActorInTheSpotlight().attemptsTo(
            SeValida.queLaLlamada()
        );
        theActorInTheSpotlight().should
            (seeThat(ValidarLlamada.estaConfirmada(), containsString(ESTADO_COMPLETO)));
    }
}
