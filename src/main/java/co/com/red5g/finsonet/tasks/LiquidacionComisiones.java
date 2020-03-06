package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_CICLO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LiquidacionComisiones implements Task {

    private static final int TIEMPO = 660;
    private final String ciclo;

    public LiquidacionComisiones(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            SelectFromOptions.byVisibleText(ciclo).from(LST_CICLO),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds()
        );
    }
}