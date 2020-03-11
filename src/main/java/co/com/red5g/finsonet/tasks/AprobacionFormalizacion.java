package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_GUARDAR_DATOS;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_COLUMNA_NOMBRE_FORMALIZACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionFormalizacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(LST_COLUMNA_NOMBRE_FORMALIZACION.of(numeroCredito)));
        actor.attemptsTo(
            Click.on(BTN_GUARDAR_DATOS),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(5).seconds(),
            Click.on(BTN_OK)
        );
    }
}