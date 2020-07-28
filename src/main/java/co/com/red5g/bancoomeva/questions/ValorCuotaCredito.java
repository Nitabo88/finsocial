package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.utils.data.Constantes.VALORES;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorCuotaCredito implements Question<Integer> {

  public ValorCuotaCredito() {
  }

  @Override
  public Integer answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    Integer monto = Integer.parseInt(valores.get(0));
    Integer bancaSeguro = Integer.parseInt(valores.get(6));
    Double tasa = Double.parseDouble(valores.get(2));
    return Math.toIntExact(Math.round(monto + ((monto + bancaSeguro) * (tasa / 100)) + bancaSeguro));
  }
}
