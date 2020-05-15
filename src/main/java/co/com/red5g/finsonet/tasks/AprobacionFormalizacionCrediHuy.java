package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AprobacionFormalizacionCrediHuy implements Task {

    private static final int TIEMPO = 150;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                WaitUntil.the(LBL_FORMALIZACION, isPresent()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LST_NOMBRE_FORMALIZACION_CREDIHUY.of(numeroCredito)));
        actor.attemptsTo(
                Click.on(LST_NOMBRE_FORMALIZACION_CREDIHUY.of(numeroCredito)),
                WaitUntil.the(BTN_GUARDAR, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_GUARDAR),
                WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK)
        );
    }
}
