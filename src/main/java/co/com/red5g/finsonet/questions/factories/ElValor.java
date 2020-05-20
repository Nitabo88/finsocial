package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.*;
import net.serenitybdd.screenplay.Question;

public final class ElValor {

  private ElValor() {
  }

  public static Question<String> deVentaNuevaEsConsistente() {
    return new ValorVentaNuevaLiquidacionComisiones();
  }

  public static Question<String> deVentaLiberadaEsConsistente() {
    return new ValorVentaLiberadaLiquidacionComisiones();
  }

  public static Question<String> delReporteDeOriginacion() {
    return new ValorReporteOriginacion();
  }

  public static Question<String> delReporteDeVentaNueva() {
    return new ValorReporteVentaNueva();
  }

  public static Question<String> delDetalleDelReporteDeVentaNueva() {
    return new ValorDetalleReporteVentaNueva();
  }

  public static Question<String> delReporteDeVentaLiberada() {
    return new ValorReporteVentaLiberada();
  }

  public static Question<String> delDetalleDelReporteDeVentaLiberada() {
    return new ValorDetalleReporteVentaLiberada();
  }

  public static Question<Boolean> deCreditosDeLiquidacionDeComisiones() {
    return new ValorConsolidadoLiquidadorComisiones();
  }

  public static Question<Boolean> deLaComision() {
    return new ValorTotalComision();
  }

  public static Question<Boolean> delDetalleDeLaComisionPorAsesor() {
    return new ValorComisionAsesores();
  }

  public static Question<String> delReporteDeFinsoamigo() {
    return new ValorReporteFinsoamigo();
  }
}