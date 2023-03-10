package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LBL_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_INCORPORACION_HUY_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.LBL_DATOS_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.PlanillaOriginacionPage.TXT_FECHA_LIQUIDACION_CREDITO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static co.com.red5g.utils.string.UtileriaFechas.sumarRestarDias;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.SeleccionarFecha;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionIncorporacionCreditoHuy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        String fechaPosterior = sumarRestarDias(1);
        actor.attemptsTo(
            WaitUntil.the(LBL_INCORPORACION, isVisible()).forNoMoreThan(TIEMPO_120).seconds(),
            Scroll.to(LST_INCORPORACION_HUY_NOMBRE.of(numeroCredito)).andAlignToBottom(),
            JavaScriptClick.on(LST_INCORPORACION_HUY_NOMBRE.of(numeroCredito)),
            Scroll.to(LBL_DATOS_LIBRANZA).andAlignToBottom(),
            SeleccionarFecha.deConsulta(TXT_FECHA_LIQUIDACION_CREDITO, fechaPosterior),
            WaitFor.seconds(3),
            Scroll.to(BTN_APROBAR).andAlignToBottom(),
            Click.on(BTN_APROBAR),
            WaitFor.seconds(3),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Scroll.to(BTN_OK).andAlignToBottom(),
            Click.on(BTN_OK));
    }
}
