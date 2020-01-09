package co.com.red5g.finsonet.interacions;

import co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_PERIODO;
import static co.com.red5g.finsonet.utils.UtileriaFechas.obtenerPeriodoActual;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresaAReporte implements Interaction {
    private LiquidadorComisionesPage liquidadorComisionesPage;

    public static Performable liquidacionDeComisiones() {
        return instrumented (IngresaAReporte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(liquidadorComisionesPage),
                WaitUntil.the(LST_PERIODO,isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(obtenerPeriodoActual()).from(LST_PERIODO)
        );
    }
}
