package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import jdk.internal.jline.internal.ShutdownHooks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentoPage.*;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentoPage.BTN_MODAL_ENVIAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class ListadoDocumentos implements Task {
    private ListadoDocumentos listadoDocumentos;

    public ListadoDocumentos(ListadoDocumentos listadoDocumentos) {
        this.listadoDocumentos = listadoDocumentos;
    }

    public static Performable llenar(ChequeoDocumento chequeoDocumento) { return instrumented(Estado.class, chequeoDocumento);
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
