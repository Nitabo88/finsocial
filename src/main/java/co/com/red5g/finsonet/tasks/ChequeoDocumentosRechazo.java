package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PENDIENTE_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_AREA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChequeoDocumentosRechazo implements Task {

    private final ChequeoDocumento chequeoDocumento;

    public ChequeoDocumentosRechazo(final ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        final String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            JavaScriptClick.on(BTN_PENDIENTE_CHEQUEO_DOCUMENTOS.of(numeroCredito)));
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(this.chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO),
            Enter.theValue(this.chequeoDocumento.getRazonMotivo()).into(TXT_AREA),
            WaitUntil.the(BTN_ENVIAR, isEnabled()),
            Click.on(BTN_ENVIAR),
            Click.on(BTN_OK),
            Check.whether(
                BTN_ENVIAR.resolveFor(actor).isPresent())
                .andIfSo(
                    Click.on(BTN_ENVIAR),
                    Click.on(BTN_OK),
                    WaitFor.seconds(3))
                .otherwise(WaitFor.seconds(3))
        );
    }
}