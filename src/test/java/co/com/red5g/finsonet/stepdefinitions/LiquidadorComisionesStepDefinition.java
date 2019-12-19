package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.questions.factories.ElNumero;
import co.com.red5g.finsonet.questions.factories.ElValor;
import co.com.red5g.finsonet.tasks.IngresarAlReporteDeVentaNueva;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaLiberada.NUMERO_CREDITOS_VENTA_LIBERADA;
import static co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaLiberada.VALOR_VENTA_LIBERADA;
import static co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaNueva.NUMERO_CREDITOS_VENTA_NUEVA;
import static co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaNueva.VALOR_VENTA_NUEVA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class LiquidadorComisionesStepDefinition {

    @Dado("^que (.*) quiere consultar el reporte actual de liquidacion de comisiones$")
    public void consultarReporteLiquidacionComisiones(String actor) {
        theActorCalled(actor).wasAbleTo(
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
    }

    @Cuando("^el ingresa al reporte de liquidacion de comisiones - Venta Liberada del ciclo (.*)$")
    public void elIngresaAlReporteDeLiquidacionDeComisionesVentaLiberadaDelCicloCiclo(String ciclo) {
    }

    @Entonces("^el observara que el consolidado y el detalle del reporte de originacion liquidacion de comisiones - Venta Liberada es consistente$")
    public void elObservaraQueElConsolidadoYElDetalleDelReporteDeOriginacionLiquidacionDeComisionesVentaLiberadaEsConsistente() {
    }

    @Cuando("^el ingresa al reporte actual de venta nueva$")
    public void ingresarLiquidacionVentaNueva() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enLiquidacionDeComisionesVentaNueva()
        );
    }

    @Cuando("^el ingresa al reporte actual de venta liberada$")
    public void ingresarLiquidacionVentaLiberada() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enLiquidacionDeComisionesVentaLiberada()
        );

    }

    @Entonces("^el observara que el valor de venta nueva es consistente$")
    public void verificarValorVentaNueva() {
        theActorInTheSpotlight().should(
            seeThat(ElValor.deVentaNuevaEsConsistente(), containsString(theActorInTheSpotlight().recall(VALOR_VENTA_NUEVA))));
    }

    @Y("^que el numero de creditos de venta nueva es consistente$")
    public void verificarNumeroCreditosVentaNueva() {
        theActorInTheSpotlight().should(
            seeThat(ElNumero.deCreditosDeVentaNuevaEsConsistente(), containsString(theActorInTheSpotlight().recall(NUMERO_CREDITOS_VENTA_NUEVA))));
    }

    @Y("^que el numero de creditos de venta liberada es consistente$")
    public void verficarNumeroCreditosVentaLiberada() {
        theActorInTheSpotlight().should(
            seeThat(ElNumero.deCreditosDeVentaLiberadaEsConsistente(), containsString(theActorInTheSpotlight().recall(NUMERO_CREDITOS_VENTA_LIBERADA))));
    }

    @Entonces("^el observara que el valor de venta liberada es consistente$")
    public void verificarValorVentaLiberada() {
        theActorInTheSpotlight().should(
            seeThat(ElValor.deVentaLiberadaEsConsistente(), containsString(theActorInTheSpotlight().recall(VALOR_VENTA_LIBERADA))));
    }
}