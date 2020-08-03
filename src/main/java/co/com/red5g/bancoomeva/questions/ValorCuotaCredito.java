package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.utils.data.Constantes.VALORES;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorCuotaCredito implements Question<Integer> {

  @Override
  public Integer answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    int monto = Integer.parseInt(valores.get(0));
    int bancaSeguro = Integer.parseInt(valores.get(6));
    double tasa = Double.parseDouble(valores.get(2));
    return Math.toIntExact(Math.round(monto + ((monto + bancaSeguro) * (tasa / 100)) + bancaSeguro));
  }
}
