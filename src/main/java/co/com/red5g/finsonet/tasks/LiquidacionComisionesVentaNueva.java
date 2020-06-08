package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_VENTA_NUEVA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_VENTA_NUEVA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_FINSONET;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.IngresaAReporte;
import co.com.red5g.utils.string.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LiquidacionComisionesVentaNueva implements Task {

    public static final String VALOR_VENTA_NUEVA = "valor venta nueva";
    public static final String NUMERO_CREDITOS_VENTA_NUEVA = "numero de creditos venta nueva";
    private static final int TIEMPO = 10;
    private static final int ESPERA = 3;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoActual()).from(LST_PERIODO),
            WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            WaitFor.seconds(ESPERA)
        );
        actor.remember(VALOR_VENTA_NUEVA, LBL_VALOR_VENTA_NUEVA.resolveFor(actor).getText());
        actor.remember(NUMERO_CREDITOS_VENTA_NUEVA, LBL_NUMERO_CREDITOS_VENTA_NUEVA.resolveFor(actor).getText());
        actor.attemptsTo(
                IngresaAReporte.liquidacionDeComisiones()
        );
    }
}