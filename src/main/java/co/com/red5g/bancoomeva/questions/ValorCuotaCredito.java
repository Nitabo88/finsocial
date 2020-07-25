package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.questions.factories.ElValor.deSimulacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorCuotaCredito implements Question<Float> {

  private ValorCuotaCredito() {
  }

  @Override
  public Float answeredBy(Actor actor) {
    Float monto = actor.asksFor(deSimulacion(0));
    Float bancaSeguro = actor.asksFor(deSimulacion(6));
    Float tasa = actor.asksFor(deSimulacion(1));
    return (monto + bancaSeguro) * tasa;
  }
}
