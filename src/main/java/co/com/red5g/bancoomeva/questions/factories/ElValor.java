package co.com.red5g.bancoomeva.questions.factories;

import co.com.red5g.bancoomeva.questions.ValorCuotaCredito;
import co.com.red5g.bancoomeva.questions.ValoresSimulacion;
import net.serenitybdd.screenplay.Question;

public class ElValor {

  public static Question<Float> deSimulacion(int posicion) {
    return new ValoresSimulacion(posicion);
  }

  public static Question<Float> deLaCuotadelCredito() {
    return new ValorCuotaCredito();
  }
}