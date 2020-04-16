package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.AprobacionCreditoHuy;
import co.com.red5g.finsonet.tasks.AprobacionCreditos;
import co.com.red5g.finsonet.tasks.Confirmacion;
import co.com.red5g.finsonet.tasks.Formalizacion;
import co.com.red5g.finsonet.tasks.Incorporacion;
import co.com.red5g.finsonet.tasks.ReporteLiquidacionComisiones;
import co.com.red5g.finsonet.tasks.Reportes;
import co.com.red5g.finsonet.tasks.Tesoreria;
import net.serenitybdd.screenplay.Performable;

public final class Consulta {

    private Consulta() {
    }

  public static Performable elReportedeLiquidacionDeComisiones() {
    return instrumented(ReporteLiquidacionComisiones.class);
  }

  public static Performable unReporte() {
    return instrumented(Reportes.class);
  }

  public static Performable elCreditoEnConfirmacion(Credito credito) {
    return instrumented(Confirmacion.class, credito);
  }

  public static Performable elCreditoEnAprobacionDeCreditos(Credito credito) {
    return instrumented(AprobacionCreditos.class, credito);
  }

  public static Performable elCreditoEnIncorporacion(Credito credito) {
    return instrumented(Incorporacion.class, credito);
  }

  public static Performable elCreditoEnFormalizacion(Credito credito) {
    return instrumented(Formalizacion.class, credito);
  }

  public static Performable elCreditoEnTesoreria(Credito credito) {
    return instrumented(Tesoreria.class, credito);
  }

  public static Performable elCreditoEnAprobacionDeCreditosHuy() {
    return instrumented(AprobacionCreditoHuy.class);
  }
}