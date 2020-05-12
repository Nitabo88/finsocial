package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AprobacionTesoreriaLibranza implements Task {

    private static final int TIEMPO = 120;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = "94951";
        actor.attemptsTo(
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LST_NOMBRE_TESORERIA_LIBRANZA.of(numeroCredito)));
        actor.attemptsTo(
                Click.on(LST_NOMBRE_TESORERIA_LIBRANZA.of(numeroCredito)),
                cambiarPestanaActual(),
                Click.on(BTN_ENVIAR_ANTECARTERA),
                WaitUntil.the(BTN_ENVIAR, isClickable()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_ENVIAR),
                cerrarPestana()
        );
    }
}
