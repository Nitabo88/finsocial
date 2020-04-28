package co.com.red5g.questions;

import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.LBL_VALOR_VENTA_LIBERADA;

import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorReporteVentaLiberada implements Question<String> {

    private static final Pattern FORMATO = Pattern.compile("[^\\d]");

    @Override
    public String answeredBy(Actor actor) {
        return FORMATO.matcher(LBL_VALOR_VENTA_LIBERADA.resolveFor(actor).getText()).replaceAll("");
    }
}
