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
import static co.com.red5g.utils.data.Constantes.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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
                Click.on(BTN_OK));
        actor.attemptsTo(
            Check.whether(
                BTN_ENVIAR.resolveFor(actor).isPresent())
                .andIfSo(
                    Click.on(BTN_ENVIAR),
                    WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_3).seconds(),
                    Click.on(BTN_OK)
                )
        );
    }
}