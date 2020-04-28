package co.com.red5g.questions.finsonet;

import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.LBL_MENSAJE_BLOQUEADO;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.TXT_NOMBRE_COMPLETO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElMensaje implements Question<String> {

  private static final int TIEMPO = 50;

  public static ElMensaje noRegistra() {
    return new ElMensaje();
  }

  @Override
  public String answeredBy(final Actor actor) {
    actor.attemptsTo(
        WaitUntil.the(LBL_MENSAJE_BLOQUEADO, isVisible()).forNoMoreThan(TIEMPO).seconds()
    );
    return (TXT_NOMBRE_COMPLETO.resolveFor(actor).getValue());
  }
}
