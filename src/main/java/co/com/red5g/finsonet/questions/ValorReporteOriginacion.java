package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorReporteOriginacion implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
     return LBL_VALOR_ORIGINACION.resolveFor(actor).getText().replaceAll("[^\\d]", "");
    }
}
