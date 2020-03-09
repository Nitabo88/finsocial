package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_VENTA_NUEVA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_FINSONET;
import static co.com.red5g.finsonet.utils.UtileriaFechas.obtenerPeriodoActual;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ReporteVentaNueva implements Task {

    private static final int TIEMPO = 20;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(obtenerPeriodoActual()).from(LST_PERIODO),
            WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Visualizar.elReporteDeOriginacion(LNK_VER_DETALLE_VENTA_NUEVA)
        );
    }
}