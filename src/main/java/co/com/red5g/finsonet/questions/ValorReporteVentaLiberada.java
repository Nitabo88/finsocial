package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_VENTA_LIBERADA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_VALOR_DETALLE_VENTA_LIBERADA;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorReporteVentaLiberada implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}
