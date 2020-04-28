package co.com.red5g.questions.factories;

import co.com.red5g.questions.finsonet.ValorComisionAsesores;
import co.com.red5g.questions.finsonet.ValorConsolidadoLiquidadorComisiones;
import co.com.red5g.questions.finsonet.ValorDetalleReporteVentaLiberada;
import co.com.red5g.questions.finsonet.ValorDetalleReporteVentaNueva;
import co.com.red5g.questions.finsonet.ValorReporteOriginacion;
import co.com.red5g.questions.finsonet.ValorReporteVentaLiberada;
import co.com.red5g.questions.finsonet.ValorReporteVentaNueva;
import co.com.red5g.questions.finsonet.ValorTotalComision;
import co.com.red5g.questions.finsonet.ValorVentaLiberadaLiquidacionComisiones;
import co.com.red5g.questions.finsonet.ValorVentaNuevaLiquidacionComisiones;
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
}