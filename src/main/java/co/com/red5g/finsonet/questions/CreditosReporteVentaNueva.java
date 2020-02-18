package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;

public class CreditosReporteVentaNueva implements Question<String> {

    @Override
    public String answeredBy(final Actor actor) {
        return LBL_NUMERO_CREDITOS_VENTA_NUEVA.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}