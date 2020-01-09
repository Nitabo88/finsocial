package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.tasks.Reportes;
import co.com.red5g.finsonet.tasks.ReporteLiquidacionComisiones;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Consulta {

    public static Performable elReportedeLiquidacionDeComisiones() {
        return instrumented(ReporteLiquidacionComisiones.class);
    }

    public static Performable unReporte() {
        return instrumented(Reportes.class);
    }
}