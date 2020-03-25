package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ASIGNACION_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_CONFIRMAR_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.CHK_ID_LLAMADAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AsignacionLlamadas implements Task {

    private static final int TIEMPO = 100;

    public static Performable asignarllamada() {
        return instrumented(AsignacionLlamadas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            WaitUntil.the(CHK_ID_LLAMADAS.of(numeroCredito), isPresent()).forNoMoreThan(TIEMPO).seconds(),
            JavaScriptClick.on(CHK_ID_LLAMADAS.of(numeroCredito)),
            WaitUntil.the(BTN_ASIGNACION_LIBRANZA, isPresent()).forNoMoreThan(TIEMPO).seconds(),
            JavaScriptClick.on(BTN_ASIGNACION_LIBRANZA),
            WaitUntil.the(BTN_CONFIRMAR_LLAMADAS, isPresent()).forNoMoreThan(TIEMPO).seconds(),
            JavaScriptClick.on(BTN_CONFIRMAR_LLAMADAS)
        );
    }
}
