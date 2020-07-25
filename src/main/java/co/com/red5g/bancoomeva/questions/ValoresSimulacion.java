package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.utils.data.Constantes.VALORES;

import java.io.IOException;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValoresSimulacion implements Question<Float> {

  int posicion;

  public ValoresSimulacion(int posicion) {
    this.posicion = posicion;
  }

  @Override
  public Float answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    List<Float> valoresNumericos = null;
    for (int i = 0; i < valores.size(); i++) {
      valoresNumericos.add(i, Float.parseFloat(valores.get(i).replace("[^\\d.]", "")));
    }
    return valoresNumericos.get(posicion);
  }
}
