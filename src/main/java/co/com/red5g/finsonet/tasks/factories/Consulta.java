package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.*;
import co.com.red5g.wiipo.tasks.finsonet.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

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
    return Tasks.instrumented(Confirmacion.class, credito);
  }

  public static Performable elCreditoEnAprobacionDeCreditos(Credito credito) {
    return Tasks.instrumented(AprobacionCreditos.class, credito);
  }

  public static Performable elCreditoEnIncorporacion(Credito credito) {
    return Tasks.instrumented(Incorporacion.class, credito);
  }

  public static Performable elCreditoEnFormalizacion(Credito credito) {
    return instrumented(Formalizacion.class, credito);
  }

  public static Performable elCreditoEnTesoreria(Credito credito) {
    return instrumented(Tesoreria.class, credito);
  }

  public static Performable elCreditoEnAprobacionDeCreditosHuy(Credito credito) {
    return instrumented(AprobacionCreditoHuy.class, credito);
  }

    public static Performable elCreditoEnIncorporacionHuy(Credito informacionCredito) {
      return instrumented(IncorporacionCreditoHuy.class, informacionCredito);
    }
}