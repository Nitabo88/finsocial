package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Observa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Visualizar implements Task {


    public static Performable elReporteDeOriginacion() {
        return instrumented(Visualizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Observa.losValoresConsolidados(LBL_VALOR_ORIGINACION, LBL_NUMERO_CREDITOS_ORIGINACION),
                Click.on(LNK_VER_DETALLE_ORIGINACION),
                WaitUntil.the(SPN_CARGA, isNotVisible())
        );
    }
}
