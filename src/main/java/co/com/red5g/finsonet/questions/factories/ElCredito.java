package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.PasoAprobacionDeCreditos;
import co.com.red5g.finsonet.questions.PasoChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.PasoConfirmacionExitosa;
import co.com.red5g.finsonet.questions.PasoIncorporacion;
import co.com.red5g.finsonet.questions.PasoPendienteAprobacionDeCreditos;
import net.serenitybdd.screenplay.Question;

public class ElCredito {

  public ElCredito() {
  }

  public static Question<Boolean> enConfirmacion() {
    return new PasoConfirmacionExitosa();
  }

  public static Question<Boolean> enAprobacionDeDocumentos() {
    return new PasoAprobacionDeCreditos();
  }

  public static Question<Boolean> enChequeoDeDocumentos() {
    return new PasoChequeoDeDocumentos();
  }

  public static Question<Boolean> enPendientesAprobacionCredito() {
    return new PasoPendienteAprobacionDeCreditos();
  }

  public static Question<Boolean> enIncorporacion() {
    return new PasoIncorporacion();
  }

  public static Question<Boolean> enAprobacionCredito() {
    return new PasoAprobacionDeCreditos();
  }
}
