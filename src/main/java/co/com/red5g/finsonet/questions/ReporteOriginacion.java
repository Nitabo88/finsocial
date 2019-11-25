package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

public class ReporteOriginacion implements Question <Boolean> {

    public static ReporteOriginacion esCorrecto() {
        return new ReporteOriginacion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Double sumaValorCreditoDetalle = suma (LST_VALOR_DETALLE_ORIGINACION.resolveAllFor(actor));
        Double valorCreditos = Double.parseDouble(LBL_VALOR_ORIGINACION.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        Double numeroCreditosDetalle = suma (LST_CREDITO_DETALLE_ORIGINACION.resolveAllFor(actor));
        Double numeroCreditos = Double.parseDouble(LBL_NUMERO_CREDITOS_ORIGINACION.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return sumaValorCreditoDetalle.equals(valorCreditos)&&numeroCreditosDetalle.equals(numeroCreditos);
    }
}
