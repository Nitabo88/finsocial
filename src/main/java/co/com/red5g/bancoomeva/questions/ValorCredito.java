package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.utils.data.Constantes.VALORES;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorCredito implements Question<Integer> {

  @Override
  public Integer answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    Integer monto = Integer.parseInt(valores.get(0));
    Integer bancaSeguro = Integer.parseInt(valores.get(6));
    Integer plazo = Integer.parseInt(valores.get(1));
    return Math.round((monto + bancaSeguro) * plazo);
  }
}
