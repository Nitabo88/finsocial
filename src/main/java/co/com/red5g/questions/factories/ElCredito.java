package co.com.red5g.questions.factories;

import co.com.red5g.questions.*;
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

  public static Question<Boolean> enListaPendienteDeFormalizacion() {
    return new PasoPendienteFormalizacion();
  }

  public static Question<Boolean> enTesoreria() {
    return new PasoTesoreria();
  }

  public static Question<Boolean> enListaPendienteDeTesoreria() {
    return new PasoPendienteTesoreria();
  }

  public static Question<Boolean> enTesoreriaFinsoamigo() {
    return new TesoreriaFinsoamigo();
  }

  public static Question<Boolean> enAprobacionDeCreditoHuy() {
    return new AprobacionCreditoHuy();
  }

  public static Question<Boolean> deLibranzaExiste() {
    return new CreditoLibranza();
  }

  public static Question<Boolean> huyExiste() {
    return new CreditoHuy();
  }

  public static Question<String> deLibranzaNoExiste() {
    return new CreditoLibranzaFallido();
  }

    public static Question<Boolean> enPendientesAprobacionCreditoHuy() {
      return new PasoPendienteAprobacionDeCreditosHuy();
    }

  public static Question<String> rechazado() {
    return new RechazoAprobacionCreditoHuy();
  }
}
