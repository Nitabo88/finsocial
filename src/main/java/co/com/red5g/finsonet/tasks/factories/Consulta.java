package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.AprobacionCredito;
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

    public static Performable elCreditoEnConfirmacion() {
        return instrumented(Confirmacion.class);
    }

    public static Performable elCreditoEnAprobacionDeCreditos() {
        return instrumented(AprobacionCreditos.class);
    }

  public static Performable elCreditoEnIncorporacion() {
    return instrumented(Incorporacion.class);
  }

  public static Performable elCreditoEnFormalizacion() {
    return instrumented(Formalizacion.class);
  }

  public static Performable elCreditoEnTesoreria() {
    return instrumented(Tesoreria.class);
  }

  public static Performable elCreditoEnAprobacionDeCreditosHuy() {
    return instrumented(AprobacionCreditoHuy.class);
  }
}