package co.com.red5g.questions.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.TesoreriaPage.LST_FILA_TESORERIA_PENDIENTE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PasoPendienteTesoreria implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    return LST_FILA_TESORERIA_PENDIENTE.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
