package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.LNK_VER_DETALLE_VENTA_LIBERADA;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_FINSONET;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.utils.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ReporteVentaLiberada implements Task {


    private static final int TIEMPO = 20;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoActual()).from(LST_PERIODO),
            WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Visualizar.elReporteDeOriginacion(LNK_VER_DETALLE_VENTA_LIBERADA)
        );
    }
}
