package co.com.red5g.finsonet.questions;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_FILA_PENDIENTE_FORMALIZACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PasoPendienteFormalizacion implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    return LST_FILA_PENDIENTE_FORMALIZACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
