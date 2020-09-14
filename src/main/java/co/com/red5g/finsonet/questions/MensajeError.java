package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_MENSAJE_BLOQUEADO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_NOMBRE_COMPLETO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MensajeError implements Question<String> {

  private static final int TIEMPO = 50;

  @Override
  public String answeredBy(final Actor actor) {
    actor.attemptsTo(
        WaitUntil.the(LBL_MENSAJE_BLOQUEADO, isVisible()).forNoMoreThan(TIEMPO).seconds()
    );
    return (TXT_NOMBRE_COMPLETO.resolveFor(actor).getValue());
  }
}
