package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.*;

public class NegacionCreditoLibranza implements Task {
    private final AprobacionCredito aprobacionCredito;

    public NegacionCreditoLibranza(AprobacionCredito aprobacionCredito) {
        this.aprobacionCredito = aprobacionCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                MoveMouse.to(LST_NOMBRE_APROBACION_LIBRANZA.of(numeroCredito)),
                Click.on(LST_NOMBRE_APROBACION_LIBRANZA.of(numeroCredito)),
                MoveMouse.to(BTN_NEGAR),
                Click.on(BTN_NEGAR),
                SelectFromOptions.byVisibleText(aprobacionCredito.getSeleccionMotivo())
                        .from(LST_MOTIVO_NEGAR),
                Enter.theValue(aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO_NEGACION),
                Click.on(BTN_ENVIAR_NEGACION),
                WaitFor.seconds(4),
                Click.on(BTN_OK));
    }
}
