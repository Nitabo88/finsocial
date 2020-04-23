package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AprobacionIncorporacionCreditoHuy implements Task {

    private static final int TIEMPO = 200;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                WaitUntil.the(LBL_INCORPORACION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LST_INCORPORACION_HUY_NOMBRE.of(numeroCredito)),
                JavaScriptClick.on(LST_INCORPORACION_HUY_NOMBRE.of(numeroCredito)),
                MoveMouse.to(BTN_APROBAR),
                Click.on(BTN_APROBAR),
                WaitFor.seconds(3),
                WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK));
    }
}
