package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.utils.data.Constantes.VALORES;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValoresSimulacion implements Question<Integer> {

  int posicion;

  public ValoresSimulacion(int posicion) {
    this.posicion = posicion;
  }

  @Override
  public Integer answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    return Integer.parseInt(valores.get(posicion));
  }
}
