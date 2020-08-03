package co.com.red5g.bancoomeva.questions.factories;

import co.com.red5g.bancoomeva.questions.ValorBancaSeguro;
import co.com.red5g.bancoomeva.questions.ValorCredito;
import co.com.red5g.bancoomeva.questions.ValorCuotaCredito;
import co.com.red5g.bancoomeva.questions.ValorSeguroVida;
import co.com.red5g.bancoomeva.questions.ValoresSimulacion;
import net.serenitybdd.screenplay.Question;

public class ElValor {

  private ElValor() {
  }

  public static Question<Integer> deSimulacion(int posicion) {
    return new ValoresSimulacion(posicion);
  }

  public static Question<Integer> deLaCuotadelCredito() {
    return new ValorCuotaCredito();
  }

  public static Question<Integer> deBancaSeguro() {
    return new ValorBancaSeguro();
  }

  public static Question<Integer> delCredito() {
    return new ValorCredito();
  }

  public static Question<Integer> delSeguroDeVida() {
    return new ValorSeguroVida();
  }
}