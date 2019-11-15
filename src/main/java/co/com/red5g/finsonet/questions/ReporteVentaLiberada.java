package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_ANTECARTERA;
import static co.com.red5g.finsonet.utils.Utilidades.suma;

public class ReporteVentaLiberada implements Question <Boolean> {

    public static ReporteVentaLiberada esCorrecto() {
        return new ReporteVentaLiberada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Double sumaValorCreditoDetalle = suma (LST_VALOR_DETALLE_ANTECARTERA.resolveAllFor(actor));
        Double valorCreditos = Double.parseDouble(LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        Double numeroCreditosDetalle = suma (LST_CREDITO_DETALLE_ANTECARTERA.resolveAllFor(actor));
        Double numeroCreditos = Double.parseDouble(LBL_NUMERO_CREDITOS_VENTA_LIBERADA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return sumaValorCreditoDetalle.equals(valorCreditos)&numeroCreditosDetalle.equals(numeroCreditos);
    }
}
