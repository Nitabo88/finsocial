package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PendienteCrediHuy implements Task {

    private static final int TIEMPO = 20;
    private ChequeoDocumento chequeoDocumento;

    public PendienteCrediHuy(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                JavaScriptClick.on(BTN_PENDIENTE_CHEQUEO_DOCUMENTOS_CREDIHUY.of(numeroCredito)),
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
