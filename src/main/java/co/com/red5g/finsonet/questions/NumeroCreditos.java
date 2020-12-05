package co.com.red5g.finsonet.questions;

import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class NumeroCreditos implements Question<String> {

  Target numero;
  private static final Pattern FORMATO = Pattern.compile("[^\\d]");

  public NumeroCreditos(Target numero) {
    this.numero = numero;
  }

  @Override
  public String answeredBy(Actor actor) {
    return FORMATO.matcher(numero.resolveFor(actor).getText()).replaceAll("");
  }
}
