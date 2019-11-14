package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_REPORTES;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Navegar implements Task {

    public static Performable alosReportesDeVenta() {
        return instrumented(Navegar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LNK_REPORTES,isClickable()),
                Click.on(LNK_REPORTES),
                WaitUntil.the(SPN_CARGA, isNotVisible()));
    }
}
