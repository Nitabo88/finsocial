package co.com.red5g.finsonet.questions;

import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValorCreditosRadicados implements Question<String> {

  Target lblValor;
  private static final Pattern FORMATO = Pattern.compile("[^\\d]");

  public ValorCreditosRadicados(Target lblValor) {
    this.lblValor = lblValor;
  }

  @Override
  public String answeredBy(Actor actor) {
    return FORMATO.matcher(lblValor.resolveFor(actor).getText()).replaceAll("");
  }
}
