package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_ENVIAR_NEGACION;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_NEGAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_MOTIVO_NEGAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_NOMBRE_APROBACION_CREDITO_HUY;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.TXT_MOTIVO_NEGACION;
import static co.com.red5g.utils.data.Constantes.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class NegacionCreditoHuy implements Task {
    private AprobacionCredito aprobacionCredito;

    public NegacionCreditoHuy(AprobacionCredito aprobacionCredito) {
        this.aprobacionCredito = aprobacionCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            MoveMouse.to(LST_NOMBRE_APROBACION_CREDITO_HUY.of(numeroCredito)),
            Click.on(LST_NOMBRE_APROBACION_CREDITO_HUY.of(numeroCredito)),
            MoveMouse.to(BTN_NEGAR),
            Click.on(BTN_NEGAR),
            SelectFromOptions.byVisibleText(aprobacionCredito.getSeleccionMotivo())
                .from(LST_MOTIVO_NEGAR),
            Enter.theValue(aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO_NEGACION),
            Click.on(BTN_ENVIAR_NEGACION),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_OK));
    }
}