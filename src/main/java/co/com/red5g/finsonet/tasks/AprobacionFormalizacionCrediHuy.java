package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LBL_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_NOMBRE_FORMALIZACION_CREDIHUY;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionFormalizacionCrediHuy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            WaitUntil.the(LBL_FORMALIZACION, isPresent()).forNoMoreThan(TIEMPO_60).seconds(),
            MoveMouse.to(LST_NOMBRE_FORMALIZACION_CREDIHUY.of(numeroCredito)));
        actor.attemptsTo(
            Click.on(LST_NOMBRE_FORMALIZACION_CREDIHUY.of(numeroCredito)),
            WaitUntil.the(BTN_GUARDAR, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Click.on(BTN_GUARDAR),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_OK)
        );
    }
}
