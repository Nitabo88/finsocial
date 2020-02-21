package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_FILA_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_FILA_PENDIENTE_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoIncorporacionPendiente implements Question<Boolean> {

  private static final String INCORPORACION = "Incorporación";

  @Override
  public Boolean answeredBy(Actor actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNU_ORIGINACION.of(INCORPORACION)));
    return LST_FILA_PENDIENTE_INCORPORACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
