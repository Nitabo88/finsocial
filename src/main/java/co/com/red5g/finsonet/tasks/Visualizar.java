package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Visualizar implements Task {
    private Target lnkReporte;

    public Visualizar(Target lnkReporte) {
        this.lnkReporte = lnkReporte;
    }

    public static Performable elReporteDeOriginacion(Target lnkReporte) {
        return instrumented(Visualizar.class,lnkReporte);
    }

    public static Performable elReporteDeAntecartera(Target lnkReporte) {
        return instrumented(Visualizar.class,lnkReporte);
    }

    public static Performable elReporteDeVentaNueva(Target lnkReporte) {
        return instrumented(Visualizar.class,lnkReporte);
    }

    public static Performable elReporteDeVentaLiberada(Target lnkReporte) {
        return instrumented(Visualizar.class,lnkReporte);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SPN_CARGA, isNotVisible()),
                Click.on(lnkReporte),
                WaitUntil.the(SPN_CARGA, isNotVisible())
        );
    }
}
