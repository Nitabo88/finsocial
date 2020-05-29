package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AprobacionTesoreriaCrediHuy implements Task {
    private static final int TIEMPO = 240;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LBL_NOMBRE_TESORERIA_CREDIHUY.of(numeroCredito)),
                Click.on(LBL_NOMBRE_TESORERIA_CREDIHUY.of(numeroCredito)),
                cambiarPestanaActual());
        String valorGiro = LBL_VALOR_GIRO.resolveFor(actor).getValue().replaceAll("[^\\d]", "");
        actor.attemptsTo(
                Enter.theValue("0").into(TXT_CUOTA_RETENIDA),
                Enter.theValue(valorGiro).into(TXT_VALOR_GIRO),
                WaitFor.seconds(3),
                Click.on(BTN_ENVIAR_CARTERA));
        actor.attemptsTo(
                WaitUntil.the(BTN_ENVIAR, isClickable()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_ENVIAR),
                WaitUntil.the(BTN_OK, isPresent()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK),
                cerrarPestana()
        );
    }
}
