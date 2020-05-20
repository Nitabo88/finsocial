package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.regex.Pattern;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_ORIGINACION;

public class CreditosReporteFinsoamigo implements Question<String> {
    private static final Pattern FORMATO = Pattern.compile("[^\\d]");

    @Override
    public String answeredBy(Actor actor) {
        return FORMATO.matcher(LBL_NUMERO_CREDITOS_ORIGINACION.resolveFor(actor).getText()).replaceAll("");
    }
}
