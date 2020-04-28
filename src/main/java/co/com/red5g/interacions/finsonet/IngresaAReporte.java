package co.com.red5g.interacions.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.red5g.userinterfaces.finsonet.LiquidadorComisionesPage;
import co.com.red5g.utils.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresaAReporte implements Interaction {
    private LiquidadorComisionesPage liquidadorComisionesPage;

    public static Performable liquidacionDeComisiones() {
        return instrumented (IngresaAReporte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(liquidadorComisionesPage),
                WaitUntil.the(LiquidadorComisionesPage.LST_PERIODO,isEnabled()).forNoMoreThan(10).seconds(),
            SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoActual()).from(LiquidadorComisionesPage.LST_PERIODO)
        );
    }
}