package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.PasoAprobacionDeDocumentos;
import co.com.red5g.finsonet.questions.PasoConfirmacionExitosa;
import net.serenitybdd.screenplay.Question;

public class ElCredito {

  public static Question<Boolean> enConfirmacion() {
    return new PasoConfirmacionExitosa();
  }

  public static Question<Boolean> enAprobacionDeDocumentos() {
    return new PasoAprobacionDeDocumentos();
  }
}
