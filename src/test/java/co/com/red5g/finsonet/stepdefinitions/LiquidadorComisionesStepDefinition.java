package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.ElNumero;
import co.com.red5g.finsonet.questions.factories.ElValor;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaLiberada;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaNueva;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class LiquidadorComisionesStepDefinition {

    @Dado("^que (.*) quiere consultar el reporte actual de liquidacion de comisiones$")
    public void consultarReporteLiquidacionComisiones(String actor) {
        theActorCalled(actor).wasAbleTo(
                Consulta.elReportedeLiquidacionDeComisiones()
        );
    }

    @Cuando("^el ingresa al reporte de liquidacion de comisiones - Venta Nueva del ciclo (.*)$")
    public void ingresarLiquidacionComisiones(String ciclo) {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.alReporteDeLiquidacionDeComisiones(ciclo)
        );
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
            seeThat(ElValor.deVentaNuevaEsConsistente(), containsString(theActorInTheSpotlight().recall(LiquidacionComisionesVentaNueva.VALOR_VENTA_NUEVA))));
    }

    @Y("^que el numero de creditos de venta nueva es consistente$")
    public void verificarNumeroCreditosVentaNueva() {
        theActorInTheSpotlight().should(
            seeThat(ElNumero.deCreditosDeVentaNuevaEsConsistente(), containsString(theActorInTheSpotlight().recall(LiquidacionComisionesVentaNueva.NUMERO_CREDITOS_VENTA_NUEVA))));
    }

    @Y("^que el numero de creditos de venta liberada es consistente$")
    public void verificarNumeroCreditosVentaLiberada() {
        theActorInTheSpotlight().should(
            seeThat(ElNumero.deCreditosDeVentaLiberadaEsConsistente(), containsString(theActorInTheSpotlight().recall(LiquidacionComisionesVentaLiberada.NUMERO_CREDITOS_VENTA_LIBERADA))));
    }

    @Entonces("^el observara que el valor de venta liberada es consistente$")
    public void verificarValorVentaLiberada() {
        theActorInTheSpotlight().should(
            seeThat(ElValor.deVentaLiberadaEsConsistente(), containsString(theActorInTheSpotlight().recall(LiquidacionComisionesVentaLiberada.VALOR_VENTA_LIBERADA))));
    }

    @Entonces("^el observara que el numero de creditos consolidado y el detalle del reporte de liquidacion de comisiones es consistente$")
    public void verificarNumeroCreditosDetalle() {
        theActorInTheSpotlight().should(seeThat(ElNumero.deCreditosDeLiquidacionDeComisiones()));
    }

    @Y("^que el valor del consolidado y el detalle del reporte de liquidacion de comisiones es consistente$")
    public void verificarValorConsolidadoDetalle() {
        theActorInTheSpotlight().should(seeThat(ElValor.deCreditosDeLiquidacionDeComisiones()));
    }

    @Entonces("^el observara que el valor liquidado, corresponde al valor total del detalle$")
    public void verificarValorLiquidacionComision() {
        theActorInTheSpotlight().should(seeThat(ElValor.deLaComision()));
    }

    @Y("^que el detalle por asesor es el adecuado$")
    public void verificarDetalleValorLiquidacionComision() {
        theActorInTheSpotlight().should(seeThat(ElValor.delDetalleDeLaComisionPorAsesor()));
    }
}