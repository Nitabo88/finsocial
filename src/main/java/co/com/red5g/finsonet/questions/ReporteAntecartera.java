package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.*;
import static co.com.red5g.finsonet.utils.Utilidades.suma;

public class ReporteAntecartera implements Question<Boolean> {

    public static ReporteAntecartera esCorrecto() {
        return new ReporteAntecartera();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Double numeroCreditosDetalle = suma (LST_CREDITO_DETALLE_ANTECARTERA.resolveAllFor(actor));
        Double numeroCreditos = Double.parseDouble(LBL_NUMERO_CREDITOS_ANTECARTERA.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
        return numeroCreditosDetalle.equals(numeroCreditos);
    }
}
