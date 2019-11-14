package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.interacions.Observa.VALOR_ORIGINACION;
import static co.com.red5g.finsonet.interacions.SumaValorDetalle.SUMA_VALOR_CREDITOS;

public class Reporte implements Question<Boolean> {
    private String strValorTotalCreditos;
    private String strValorSumaDetalleCreditos;

    public static Reporte deOriginacion() {
        return new Reporte();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.remember(strValorTotalCreditos, VALOR_ORIGINACION);
        actor.remember(strValorSumaDetalleCreditos, SUMA_VALOR_CREDITOS);
        return (strValorTotalCreditos.equals(strValorSumaDetalleCreditos));
    }
}
