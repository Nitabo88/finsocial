package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_CICLO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class IngresarAlReporteDeVentaNueva implements Task {
    private String ciclo;

    public IngresarAlReporteDeVentaNueva(String ciclo) {
        this.ciclo = ciclo;
    }

    public static IngresarAlReporteDeVentaNueva delCiclo(String ciclo) {
        return instrumented(IngresarAlReporteDeVentaNueva.class, ciclo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LST_CICLO,isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(ciclo).from(LST_CICLO),
                WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(120).seconds()
        );
    }
}
