package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.PasoAprobacionDeCreditos;
import co.com.red5g.finsonet.questions.PasoChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.PasoConfirmacionExitosa;
import co.com.red5g.finsonet.questions.PasoFormalizacion;
import co.com.red5g.finsonet.questions.PasoIncorporacion;
import co.com.red5g.finsonet.questions.PasoIncorporacionPendiente;
import co.com.red5g.finsonet.questions.PasoPendienteAprobacionDeCreditos;
import co.com.red5g.finsonet.questions.PasoPendienteConfirmacion;
import co.com.red5g.finsonet.questions.PasoPendienteFormalizacion;
import net.serenitybdd.screenplay.Question;

public final class ElCredito {

  private ElCredito() {
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

  public static Question<Boolean> enLaListaPendienteDeIncorporacion() {
    return new PasoIncorporacionPendiente();
  }

  public static Question<Boolean> enLaListDeFormalizacion() {
    return new PasoFormalizacion();
  }

  public static Question<Boolean> enConfirmacionPendiente() {
    return new PasoPendienteConfirmacion();
  }

  public static Question<Boolean> enListaPendienteDeFormalizacion() { return new PasoPendienteFormalizacion();
  }
}