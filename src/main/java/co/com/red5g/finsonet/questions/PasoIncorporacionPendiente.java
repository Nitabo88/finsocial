package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_FILA_PENDIENTE_INCORPORACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoIncorporacionPendiente implements Question<Boolean> {

  private static final String INCORPORACION = "Incorporación";
  private static final int TIEMPO = 10;

  @Override
  public Boolean answeredBy(Actor actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(WaitUntil.the(LST_FILA_PENDIENTE_INCORPORACION.of(numeroCredito), isVisible()).forNoMoreThan(TIEMPO).seconds());
    return LST_FILA_PENDIENTE_INCORPORACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}