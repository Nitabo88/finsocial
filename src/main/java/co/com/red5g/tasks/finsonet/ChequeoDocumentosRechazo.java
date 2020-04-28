package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ENVIAR;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_PENDIENTE_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_MOTIVO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.TXT_AREA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.models.finsonet.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChequeoDocumentosRechazo implements Task {

    private static final int TIEMPO = 3;
    private final ChequeoDocumento chequeoDocumento;

    public ChequeoDocumentosRechazo(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            JavaScriptClick.on(BTN_PENDIENTE_CHEQUEO_DOCUMENTOS.of(numeroCredito)),
            SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO),
            Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_AREA),
            WaitUntil.the(BTN_ENVIAR, isEnabled()),
            Click.on(BTN_ENVIAR),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_OK));
        actor.attemptsTo(
            Check.whether(
                BTN_ENVIAR.resolveFor(actor).isPresent())
                .andIfSo(
                    Click.on(BTN_ENVIAR),
                    WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                    Click.on(BTN_OK)
                )
        );
    }
}