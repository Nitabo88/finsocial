package co.com.red5g.questions.finsonet;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.userinterfaces.finsonet.LiquidadorComisionesPage.LBL_TOTAL_CREDITOS_VENTA_NUEVA;

public class CreditosVentaNuevaLiquidacionComisiones implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_TOTAL_CREDITOS_VENTA_NUEVA.resolveFor(actor).getText();
    }
}