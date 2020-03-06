package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_VALOR_DETALLE_VENTA_NUEVA;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorDetalleReporteVentaNueva implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        List<WebElementFacade> lstValoresCredito= LST_VALOR_DETALLE_VENTA_NUEVA.resolveAllFor(actor);
        lstValoresCredito.remove(0);
        return String.valueOf(suma (lstValoresCredito));
    }
}
