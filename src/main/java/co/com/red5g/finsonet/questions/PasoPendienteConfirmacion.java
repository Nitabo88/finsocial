package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.LST_FILA_CONFIRMACION_PENDIENTE;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoPendienteConfirmacion implements Question<Boolean> {

  private static final int TIEMPO = 20;

  @Override
  public Boolean answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(LST_FILA_CONFIRMACION_PENDIENTE.of(numeroCredito), isVisible()).forNoMoreThan(TIEMPO).seconds());
    return LST_FILA_CONFIRMACION_PENDIENTE.of(numeroCredito).resolveFor(actor).isPresent();
  }
}