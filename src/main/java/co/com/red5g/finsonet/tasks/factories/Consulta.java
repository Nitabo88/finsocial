package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.AprobacionCreditos;
import co.com.red5g.finsonet.tasks.Confirmacion;
import co.com.red5g.finsonet.tasks.ReporteLiquidacionComisiones;
import co.com.red5g.finsonet.tasks.Reportes;
import net.serenitybdd.screenplay.Performable;

public class Consulta {

    public Consulta() {
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
}