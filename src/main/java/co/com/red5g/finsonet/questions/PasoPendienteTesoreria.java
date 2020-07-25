package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_PENDIENTE;

public class PasoPendienteTesoreria implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            MoveMouse.to(LST_FILA_TESORERIA_PENDIENTE.of(numeroCredito))
    );
    return LST_FILA_TESORERIA_PENDIENTE.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
