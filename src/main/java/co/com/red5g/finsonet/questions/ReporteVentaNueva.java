package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

public class ReporteVentaNueva implements Question<Boolean> {
    public static ReporteVentaNueva esCorrecto() {
        return new ReporteVentaNueva();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> lstValoresCredito= LST_VALOR_DETALLE_VENTA_NUEVA.resolveAllFor(actor);
        lstValoresCredito.remove(0);
        List<WebElementFacade> lstNumeroCredito= LST_CREDITO_DETALLE_VENTA_NUEVA.resolveAllFor(actor);
        lstNumeroCredito.remove(0);
        Double sumaValorCreditoDetalle = suma (lstValoresCredito);
        Double valorCreditos = Double.parseDouble(LBL_VALOR_VENTA_NUEVA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        Double numeroCreditosDetalle = suma (lstNumeroCredito);
        Double numeroCreditos = Double.parseDouble(LBL_NUMERO_CREDITOS_VENTA_NUEVA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return sumaValorCreditoDetalle.equals(valorCreditos)&&numeroCreditosDetalle.equals(numeroCreditos);
    }
}
