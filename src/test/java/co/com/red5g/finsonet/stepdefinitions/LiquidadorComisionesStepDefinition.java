package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.ReporteLiquidacionComisiones;
import co.com.red5g.finsonet.tasks.IngresarAlReporteDeVentaNueva;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LiquidadorComisionesStepDefinition {

    @Dado("^que (.*) quiere consultar el reporte actual de liquidacion de comisiones$")
    public void consultarReporteLiquidacionComisiones(String actor) {
        theActorCalled(actor).attemptsTo(
                Consulta.elReportedeLiquidacionDeComisiones()
        );
    }

    @Cuando("^el ingresa al reporte de liquidacion de comisiones - Venta Nueva del ciclo (.*)$")
    public void elIngresaAlReporteDeLiquidacionDeComisionesVentaNuevaDelCicloCiclo(String ciclo) {
        theActorInTheSpotlight().attemptsTo(
                IngresarAlReporteDeVentaNueva.delCiclo(ciclo)
        );
    }

    @Entonces("^el observara que el consolidado y el detalle del reporte de originacion liquidacion de comisiones - Venta Nueva es consistente$")
    public void elObservaraQueElConsolidadoYElDetalleDelReporteDeOriginacionLiquidacionDeComisionesVentaNuevaEsConsistente() {
        theActorInTheSpotlight().should(seeThat(ReporteLiquidacionComisionesVentaNueva.esCorrecto(),""));
    }


    @Cuando("^el ingresa al reporte de liquidacion de comisiones - Venta Liberada del ciclo (.*)$")
    public void elIngresaAlReporteDeLiquidacionDeComisionesVentaLiberadaDelCicloCiclo(String ciclo) {
    }

    @Entonces("^el observara que el consolidado y el detalle del reporte de originacion liquidacion de comisiones - Venta Liberada es consistente$")
    public void elObservaraQueElConsolidadoYElDetalleDelReporteDeOriginacionLiquidacionDeComisionesVentaLiberadaEsConsistente() {
    }
}
