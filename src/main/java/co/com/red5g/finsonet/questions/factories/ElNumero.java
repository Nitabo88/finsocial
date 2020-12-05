package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.CreditosDetalleReporteVentaLiberada;
import co.com.red5g.finsonet.questions.CreditosDetalleReporteVentaNueva;
import co.com.red5g.finsonet.questions.CreditosLiquidacionComision;
import co.com.red5g.finsonet.questions.CreditosReporteAntecartera;
import co.com.red5g.finsonet.questions.CreditosReporteFinsoamigo;
import co.com.red5g.finsonet.questions.CreditosReporteOriginacion;
import co.com.red5g.finsonet.questions.CreditosReporteVentaLiberada;
import co.com.red5g.finsonet.questions.CreditosReporteVentaNueva;
import co.com.red5g.finsonet.questions.CreditosVentaLiberadaLiquidacionComisiones;
import co.com.red5g.finsonet.questions.CreditosVentaNuevaLiquidacionComisiones;
import co.com.red5g.finsonet.questions.NumeroCreditos;
import co.com.red5g.finsonet.questions.NumeroCreditosDetalle;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public final class ElNumero {

  private ElNumero() {
  }

  public static Question<String> deCreditosDeVentaNuevaEsConsistente() {
    return new CreditosVentaNuevaLiquidacionComisiones();
  }

  public static Question<String> deCreditosDeVentaLiberadaEsConsistente() {
    return new CreditosVentaLiberadaLiquidacionComisiones();
  }

  public static Question<String> deCreditosDelReporteDeOriginacion() {
    return new CreditosReporteOriginacion();
  }

  public static Question<String> deCreditosDelReporteDeAntecartera() {
    return new CreditosReporteAntecartera();
  }

  public static Question<String> deCreditosDelReporteDeVentaNueva() {
    return new CreditosReporteVentaNueva();
  }

  public static Question<String> delDetalleDeCreditosDelReporteDeVentaNueva() {
    return new CreditosDetalleReporteVentaNueva();
  }

  public static Question<String> deCreditosDelReporteDeVentaLiberada() {
    return new CreditosReporteVentaLiberada();
  }

  public static Question<String> delDetalleDeCreditosDelReporteDeVentaLiberada() {
    return new CreditosDetalleReporteVentaLiberada();
  }

  public static Question<Boolean> deCreditosDeLiquidacionDeComisiones() {
    return new CreditosLiquidacionComision();
  }

  public static Question<String> deCreditosDelReporteDeFinsoamigo() {
    return new CreditosReporteFinsoamigo();
  }

  public static Question<String> totalDeLosCreditos(Target lblNumero) {
    return new NumeroCreditos(lblNumero);
  }

  public static Question<String> delDetalleDeCreditos(Target creditosDetalle) {
    return new NumeroCreditosDetalle(creditosDetalle);
  }
}