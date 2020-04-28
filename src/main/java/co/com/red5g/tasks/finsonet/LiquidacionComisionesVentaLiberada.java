package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.LBL_NUMERO_CREDITOS_VENTA_LIBERADA;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.LBL_VALOR_VENTA_LIBERADA;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_FINSONET;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.interacions.IngresaAReporte;
import co.com.red5g.utils.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LiquidacionComisionesVentaLiberada implements Task {

    public static final String VALOR_VENTA_LIBERADA = "valor venta nueva";
    public static final String NUMERO_CREDITOS_VENTA_LIBERADA = "numero de creditos venta nueva";
    private static final int TIEMPO = 10;
    private static final int ESPERA = 3;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoActual()).from(LST_PERIODO),
            WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            WaitFor.seconds(ESPERA)
        );
        actor.remember(VALOR_VENTA_LIBERADA, LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText());
        actor.remember(NUMERO_CREDITOS_VENTA_LIBERADA, LBL_NUMERO_CREDITOS_VENTA_LIBERADA.resolveFor(actor).getText());
        actor.attemptsTo(
                IngresaAReporte.liquidacionDeComisiones()
        );
    }
}