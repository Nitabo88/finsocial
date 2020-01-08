package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_VENTA_LIBERADA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_VENTA_LIBERADA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static co.com.red5g.finsonet.utils.UtileriaFechas.obtenerPeriodoActual;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.interacions.IngresaAReporte;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LiquidacionComisionesVentaLiberada implements Task {
    public static final String VALOR_VENTA_LIBERADA = "valor venta nueva";
    public static final String NUMERO_CREDITOS_VENTA_LIBERADA = "numero de creditos venta nueva";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(obtenerPeriodoActual()).from(LST_PERIODO),
                WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(5).seconds()
        );
        actor.remember(VALOR_VENTA_LIBERADA, LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText());
        actor.remember(NUMERO_CREDITOS_VENTA_LIBERADA, LBL_NUMERO_CREDITOS_VENTA_LIBERADA.resolveFor(actor).getText());
        actor.attemptsTo(
                IngresaAReporte.liquidacionDeComisiones()
        );
    }
}