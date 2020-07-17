package co.com.red5g.bancoomeva.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValorMinimo implements Question<String> {

  String valorMinimo;
  Target modal;

  public ValorMinimo(Target modal) {
    this.modal = modal;
  }

  public static Question<String> elValorMinimo(Target modal) {
    return new ValorMinimo(modal);
  }

  @Override
  public String answeredBy(Actor actor) {
    valorMinimo = modal.resolveFor(actor).getText().split("\\$")[1];
    return valorMinimo.split("\\)")[0].replace("[^\\d]", "");
  }
}
