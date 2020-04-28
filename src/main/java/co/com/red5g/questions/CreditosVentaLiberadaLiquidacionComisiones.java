package co.com.red5g.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.userinterfaces.finsonet.LiquidadorComisionesPage.LBL_TOTAL_CREDITOS_VENTA_LIBERADA;

public class CreditosVentaLiberadaLiquidacionComisiones implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_TOTAL_CREDITOS_VENTA_LIBERADA.resolveFor(actor).getText();
    }
}