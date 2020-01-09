package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListadoDocumentos implements Task {
    private ChequeoDocumento chequeoDocumento;

    public ListadoDocumentos(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    public static Performable llenar(ChequeoDocumento chequeoDocumento) {
        return instrumented(ListadoDocumentos.class, chequeoDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO),
                Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_AREA),
                Click.on(BTN_ENVIAR),
                Click.on(BTN_OK));
    }
}
