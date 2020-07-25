package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PENDIENTE_CHEQUEO_DOCUMENTOS_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_AREA;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChequeoDocumentosRechazo implements Task {

    private final ChequeoDocumento chequeoDocumento;

    public ChequeoDocumentosRechazo(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            JavaScriptClick.on(BTN_PENDIENTE_CHEQUEO_DOCUMENTOS_LIBRANZA.of(numeroCredito)),
            SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO),
            Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_AREA),
            WaitUntil.the(BTN_ENVIAR, isEnabled()),
            Click.on(BTN_ENVIAR),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_3).seconds(),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_OK));
    }
}