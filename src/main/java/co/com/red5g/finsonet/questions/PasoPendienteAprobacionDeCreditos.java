package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_PENDIENTE_APROBACION_CREDITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PasoPendienteAprobacionDeCreditos implements Question<Boolean> {

  @Override
  public Boolean answeredBy(final Actor actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    return LST_PENDIENTE_APROBACION_CREDITO.of(numeroCredito).resolveFor(actor).isPresent();
  }
}