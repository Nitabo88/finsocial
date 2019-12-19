package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.ValorDetalleReporteVentaNueva;
import co.com.red5g.finsonet.questions.ValorReporteOriginacion;
import co.com.red5g.finsonet.questions.ValorReporteVentaLiberada;
import co.com.red5g.finsonet.questions.ValorReporteVentaNueva;
import co.com.red5g.finsonet.questions.ValorVentaLiberadaLiquidacionComisiones;
import co.com.red5g.finsonet.questions.ValorVentaNuevaLiquidacionComisiones;
import net.serenitybdd.screenplay.Question;

public class ElValor {

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
    return new ValorReporteVentaLiberada();
  }
}