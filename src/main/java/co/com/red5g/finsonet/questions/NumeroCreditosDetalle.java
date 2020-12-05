package co.com.red5g.finsonet.questions;

import static co.com.red5g.utils.Utilerias.suma;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class NumeroCreditosDetalle implements Question<String> {

  Target creditosDetalle;

  public NumeroCreditosDetalle(Target creditosDetalle) {
    this.creditosDetalle = creditosDetalle;
  }

  @Override
  public String answeredBy(Actor actor) {
    List<WebElementFacade> lstCreditosDetalle = creditosDetalle.resolveAllFor(actor);
    lstCreditosDetalle.remove(0);
    return String.valueOf(suma(lstCreditosDetalle));
  }
}
