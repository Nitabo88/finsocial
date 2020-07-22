package co.com.red5g.finsonet.tasks;

import static co.com.red5g.general.interactions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_ENVIAR_CARTERA;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LBL_VALOR_GIRO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_NOMBRE_TESORERIA_CREDIHUY;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.TXT_CUOTA_RETENIDA;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.TXT_VALOR_GIRO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_5;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionTesoreriaCrediHuy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds(),
            MoveMouse.to(LST_NOMBRE_TESORERIA_CREDIHUY.of(numeroCredito)),
            Click.on(LST_NOMBRE_TESORERIA_CREDIHUY.of(numeroCredito)),
            cambiarPestanaActual());
        String valorGiro = LBL_VALOR_GIRO.resolveFor(actor).getValue().replaceAll("[^\\d]", "");
        actor.attemptsTo(
            Enter.theValue("0").into(TXT_CUOTA_RETENIDA),
            Enter.theValue(valorGiro).into(TXT_VALOR_GIRO),
            WaitFor.seconds(TIEMPO_5),
            MoveMouse.to(BTN_ENVIAR_CARTERA),
            Click.on(BTN_ENVIAR_CARTERA),
            WaitUntil.the(BTN_ENVIAR, isClickable()).forNoMoreThan(TIEMPO_10).seconds(),
            Click.on(BTN_ENVIAR),
            WaitFor.seconds(TIEMPO_3),
            WaitUntil.the(BTN_OK, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
            Click.on(BTN_OK),
            cerrarPestana()
        );
    }
}
