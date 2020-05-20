package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.regex.Pattern;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_FINSOAMIGO;

public class ValorReporteFinsoamigo implements Question<String> {

    private static final Pattern FORMATO = Pattern.compile("[^\\d]");

    @Override
    public String answeredBy(Actor actor) {
        return FORMATO.matcher(LBL_VALOR_FINSOAMIGO.resolveFor(actor).getText()).replaceAll("");
    }
}
