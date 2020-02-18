package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_VENTA_LIBERADA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorReporteVentaLiberada implements Question<String> {

    @Override
    public String answeredBy(final Actor actor) {
        return LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}
