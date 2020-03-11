package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.AsignacionLlamadas;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LlamadasStepDefinition {

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
        String numeroCredito = "84548";

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LST_FILA_LLAMADAS.of(numeroCredito), isVisible()),
                JavaScriptClick.on(LST_FILA_LLAMADAS.of(numeroCredito)),
                cambiarPestanaActual(),
                Click.on(CHK_RESPUESTA_CUATRO.of(numeroCredito)),
                Click.on(CHK_RESPUESTA_QUINTO.of(numeroCredito)),
                Enter.theValue("Pruebas de validacion de la escritura de el mundo mundial ").into(TXT_OBSERVACION_LLAMADA.of(numeroCredito))

        );

    }

    @Entonces("^el credito quedara confirmado$")
    public void elCreditoQuedaraConfirmado() {
        //el question es cuando el credito quedo melo.
    }
}
