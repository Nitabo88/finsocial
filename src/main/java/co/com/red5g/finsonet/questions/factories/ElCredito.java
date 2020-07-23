package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.AntecarteraLibranza;
import co.com.red5g.finsonet.questions.AprobacionCreditoHuy;
import co.com.red5g.finsonet.questions.CarteraHuy;
import co.com.red5g.finsonet.questions.CodigoRespuesta;
import co.com.red5g.finsonet.questions.CreditoHuy;
import co.com.red5g.finsonet.questions.CreditoLibranza;
import co.com.red5g.finsonet.questions.CreditoLibranzaFallido;
import co.com.red5g.finsonet.questions.CreditosPorConfirmar;
import co.com.red5g.finsonet.questions.PasoAprobacionDeCreditos;
import co.com.red5g.finsonet.questions.PasoChequeoDeDocumentos;
import co.com.red5g.finsonet.questions.PasoConfirmacionExitosa;
import co.com.red5g.finsonet.questions.PasoFormalizacion;
import co.com.red5g.finsonet.questions.PasoIncorporacion;
import co.com.red5g.finsonet.questions.PasoIncorporacionPendiente;
import co.com.red5g.finsonet.questions.PasoPendienteAprobacionDeCreditos;
import co.com.red5g.finsonet.questions.PasoPendienteAprobacionDeCreditosHuy;
import co.com.red5g.finsonet.questions.PasoPendienteConfirmacion;
import co.com.red5g.finsonet.questions.PasoPendienteFormalizacion;
import co.com.red5g.finsonet.questions.PasoPendienteTesoreria;
import co.com.red5g.finsonet.questions.PasoTesoreria;
import co.com.red5g.finsonet.questions.RechazoAprobacionCreditoHuy;
import co.com.red5g.finsonet.questions.TesoreriaCrediHuy;
import co.com.red5g.finsonet.questions.TesoreriaPendienteFirma;
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

  public static Question<Boolean> enTesoreriaPendientePorFirma() {
    return new TesoreriaPendienteFirma();
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

  public static Question<Boolean> enAntecartera() {
    return new AntecarteraLibranza();
  }

  public static Question<Boolean> enTesoreriaCrediHuy() {
    return new TesoreriaCrediHuy();
  }

  public static Question<Boolean> enLaListaDeCreditosPorConfirmar() {
    return new CreditosPorConfirmar();
  }

  public static Question<Integer> seProceso() {
    return new CodigoRespuesta();
  }

  public static Question<Boolean> enCartera() {return new CarteraHuy();}
}
