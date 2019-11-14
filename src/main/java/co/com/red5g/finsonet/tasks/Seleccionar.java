package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Seleccionar implements Task {
    private String strFechaReporte;

    public Seleccionar(String strFechaReporte) {
        this.strFechaReporte = strFechaReporte;
    }

    public static Performable laFechaDeReporte(String strFechaReporte) {
        return instrumented(Seleccionar.class, strFechaReporte);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(strFechaReporte).from(LST_PERIODO),
                WaitUntil.the(SPN_CARGA, isNotVisible())
        );
    }
}
