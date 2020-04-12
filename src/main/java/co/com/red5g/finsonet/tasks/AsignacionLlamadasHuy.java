package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AsignacionLlamadasHuy implements Task {

    public static Performable asignarLlamadaHuy() {
        return instrumented(AsignacionLlamadasHuy.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                WaitUntil.the(CHK_ID_LLAMADAS_LIBRANZA.of(numeroCredito), isPresent()).forNoMoreThan(100).seconds(),
                JavaScriptClick.on(CHK_ID_LLAMADAS_LIBRANZA.of(numeroCredito)),
                WaitUntil.the(BTN_ASIGNACION_HUY, isPresent()).forNoMoreThan(100).seconds(),
                JavaScriptClick.on(BTN_ASIGNACION_HUY),
                WaitUntil.the(BTN_ACEPTAR, isPresent()).forNoMoreThan(100).seconds(),
                JavaScriptClick.on(BTN_ACEPTAR)
        );
    }
}
