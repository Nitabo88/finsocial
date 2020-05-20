package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.*;
import net.serenitybdd.screenplay.Question;

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
}