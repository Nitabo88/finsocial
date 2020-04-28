package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_ORIGINACION;

import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorReporteOriginacion implements Question <String> {

  private static final Pattern FORMATO = Pattern.compile("[^\\d]");

  @Override
    public String answeredBy(Actor actor) {
     return FORMATO.matcher(LBL_VALOR_ORIGINACION.resolveFor(actor).getText()).replaceAll("");
    }
}
