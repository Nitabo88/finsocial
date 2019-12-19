package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_CREDITO_DETALLE_ORIGINACION;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreditosReporteOriginacion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LBL_NUMERO_CREDITOS_ORIGINACION.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}