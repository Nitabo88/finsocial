package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_ANTECARTERA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreditosReporteAntecartera implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
       return LBL_NUMERO_CREDITOS_ANTECARTERA.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}