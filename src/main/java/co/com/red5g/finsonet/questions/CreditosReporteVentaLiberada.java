package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_VENTA_LIBERADA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreditosReporteVentaLiberada implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
       return LBL_NUMERO_CREDITOS_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}
