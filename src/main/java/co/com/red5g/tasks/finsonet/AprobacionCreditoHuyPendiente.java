package co.com.red5g.tasks.finsonet;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.*;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.BTN_ACCION_PENDIENTE_HUY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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
                WaitFor.seconds(3),
                WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK));
    }
}
