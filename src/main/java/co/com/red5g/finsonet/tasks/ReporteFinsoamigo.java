package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_VENTA_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_FINSONET;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.utils.string.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ReporteFinsoamigo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoAnterior()).from(LST_PERIODO),
                WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(TIEMPO_10).seconds(),
                Visualizar.elReporte(LNK_VER_DETALLE_VENTA_FINSOAMIGO)
        );
    }
}
