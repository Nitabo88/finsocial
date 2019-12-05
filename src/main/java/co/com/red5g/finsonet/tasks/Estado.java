package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class Estado implements Task {
    private ChequeoDocumento chequeoDocumento;

    public Estado(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    public static Performable diligenciar(ChequeoDocumento chequeoDocumento) { return instrumented(Estado.class, chequeoDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PENDIENTE, isCurrentlyEnabled()),
                Click.on(BTN_PENDIENTE),
                Click.on(LST_MODAL_DEFAULT),
                Click.on(LST_MODAL_CHECK1),
                Enter.theValue("Datos incompletos").into("//*[@id=\"area\"]"),
                Click.on(BTN_MODAL_ENVIAR));
    }
}

