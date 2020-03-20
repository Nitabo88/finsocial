package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeProcesa implements Task {

    public static Performable laLlamada() {
        return instrumented(SeProcesa.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = theActorInTheSpotlight().recall(NUMERO_CREDITO);;

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LST_FILA_LLAMADAS.of(numeroCredito), isVisible()),
                JavaScriptClick.on(LST_FILA_LLAMADAS.of(numeroCredito)),
                cambiarPestanaActual(),
                Click.on(CHK_RESPUESTA_CUATRO.of(numeroCredito)),
                Click.on(CHK_RESPUESTA_QUINTO.of(numeroCredito)),
                Enter.theValue("El credito se realizara proceso exitoza").into(TXT_OBSERVACION_LLAMADA.of(numeroCredito)),
                Click.on(BTN_GUARDAR_GESTION),
                Click.on(BTN_ADVERTENCIA_GUARDAR),
                Click.on(BTN_CERTIFICACION_LLAMADAS)
        );
    }
}
