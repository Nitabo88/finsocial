package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_FILA_PENDIENTE_INCORPORACION;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoIncorporacionPendiente implements Question<Boolean> {

  private static final int TIEMPO = 10;

  @Override
  public Boolean answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(WaitUntil.the(LST_FILA_PENDIENTE_INCORPORACION.of(numeroCredito), isVisible()).forNoMoreThan(PasoIncorporacionPendiente.TIEMPO).seconds());
    return LST_FILA_PENDIENTE_INCORPORACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}