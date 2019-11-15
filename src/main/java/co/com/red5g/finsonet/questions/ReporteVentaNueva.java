package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.utils.Utilidades.suma;

public class ReporteVentaNueva implements Question<Boolean> {
    public static ReporteVentaNueva esCorrecto() {
        return new ReporteVentaNueva();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Double sumaValorCreditoDetalle = suma (LST_VALOR_DETALLE_VENTA_NUEVA.resolveAllFor(actor));
        Double valorCreditos = Double.parseDouble(LBL_VALOR_VENTA_NUEVA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        Double numeroCreditosDetalle = suma (LST_CREDITO_DETALLE_VENTA_NUEVA.resolveAllFor(actor));
        Double numeroCreditos = Double.parseDouble(LBL_NUMERO_CREDITOS_VENTA_NUEVA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return sumaValorCreditoDetalle.equals(valorCreditos)&numeroCreditosDetalle.equals(numeroCreditos);
    }
}
