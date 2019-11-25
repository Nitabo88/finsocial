package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class VeElDetalleDeOriginacion implements Task {

    public static Performable enElReporte() {
        return instrumented(VeElDetalleDeOriginacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("2019-09").from(LST_PERIODO),
                WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(5).seconds(),
                Visualizar.elReporteDeOriginacion(LNK_VER_DETALLE_ORIGINACION)
        );
    }
}
