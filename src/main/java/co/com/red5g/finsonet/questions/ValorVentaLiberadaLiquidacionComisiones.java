package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_TOTAL_VENTA_LIBERADA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_FINSONET;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ValorVentaLiberadaLiquidacionComisiones implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(SPN_FINSONET, isNotVisible()).forNoMoreThan(5).seconds());
        return LBL_TOTAL_VENTA_LIBERADA.resolveFor(actor).getText();
    }
}