package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.MNM_ACCION;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.TXT_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION_PENDIENTE_HUY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionCreditoHuyPendiente implements Task {

    private static final int TIEMPO = 20;
    private final AprobacionCredito aprobacionCredito;
    private static final String PENDIENTE = "Pendiente";

    public AprobacionCreditoHuyPendiente(AprobacionCredito aprobacionCredito) {
        this.aprobacionCredito = aprobacionCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            MoveMouse.to(BTN_ACCION_PENDIENTE_HUY.of(numeroCredito)),
            JavaScriptClick.on(BTN_ACCION_PENDIENTE_HUY.of(numeroCredito)),
            JavaScriptClick.on(MNM_ACCION.of(PENDIENTE)),
            SelectFromOptions.byVisibleText(aprobacionCredito.getSeleccionMotivo()).from(LST_MOTIVO),
            Enter.theValue(aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO),
            WaitUntil.the(BTN_ENVIAR, isEnabled()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_ENVIAR),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_OK));
        actor.attemptsTo(
            Check.whether(
                BTN_ENVIAR.resolveFor(actor).isPresent()).andIfSo(
                Click.on(BTN_ENVIAR),
                WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK)));
    }
}
