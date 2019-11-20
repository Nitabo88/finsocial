package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

public class ReporteVentaLiberada implements Question <Boolean> {

    public static ReporteVentaLiberada esCorrecto() {
        return new ReporteVentaLiberada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> lstValoresCredito= LST_VALOR_DETALLE_VENTA_LIBERADA.resolveAllFor(actor);
        lstValoresCredito.remove(0);
        List<WebElementFacade> lstNumeroCredito= LST_CREDITO_DETALLE_VENTA_LIBERADA.resolveAllFor(actor);
        lstNumeroCredito.remove(0);
        Double sumaValorCreditoDetalle = suma (lstValoresCredito);
        Double valorCreditos = Double.parseDouble(LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        Double numeroCreditosDetalle = suma (lstNumeroCredito);
        Double numeroCreditos = Double.parseDouble(LBL_NUMERO_CREDITOS_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return sumaValorCreditoDetalle.equals(valorCreditos)&&numeroCreditosDetalle.equals(numeroCreditos);
    }
}
