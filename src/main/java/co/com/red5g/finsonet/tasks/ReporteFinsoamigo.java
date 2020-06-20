package co.com.red5g.finsonet.tasks;

import co.com.red5g.utils.string.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ReporteFinsoamigo implements Task {
    private static final int TIEMPO = 20;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoAnterior()).from(LST_PERIODO),
                WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                Visualizar.elReporteDeOriginacion(LNK_VER_DETALLE_VENTA_FINSOAMIGO)
        );
    }
}