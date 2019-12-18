package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.ElDetalleNoCorrespondeException;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.exceptions.ElDetalleNoCorrespondeException.MENSAJE_REPORTE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReporteVentasStepDefinition {

    @Dado("que un (.*) quiere consultar un reporte")
    public void ingresarReportes(String strActor) {
        theActorCalled(strActor).attemptsTo(
                Consulta.unReporte()
        );
    }

    @Cuando("el ingresa al reporte del mes de originacion")
    public void consultarReporteOriginacion() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeOriginacion()
        );
    }

    @Cuando("el ingresa al reporte del mes de antecartera")
    public void consultarReporteAntecartera() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeAntecartera()

        );
    }

    @Cuando("el ingresa al reporte del mes de venta nueva")
    public void consultarReporteVentaNueva() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeVentaNueva()
        );
    }

    @Cuando("el ingresa al reporte del mes de venta liberada")
    public void consultarVentaLiberada() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeVentaLiberada()
        );
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de originacion son consistentes")
    public void verificarReporteOriginacion(){
        theActorInTheSpotlight().should(seeThat(co.com.red5g.finsonet.questions.ReporteOriginacion.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de antecartera son consistentes")
    public void verificarReporteAntecartera(){
        theActorInTheSpotlight().should(seeThat(co.com.red5g.finsonet.questions.ReporteAntecartera.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de venta nueva son consistentes")
    public void verificarReporteVentaNueva(){
        theActorInTheSpotlight().should(seeThat(co.com.red5g.finsonet.questions.ReporteVentaNueva.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de venta liberada son consistentes")
    public void verificarReporteVentaLiberada(){
        theActorInTheSpotlight().should(seeThat(co.com.red5g.finsonet.questions.ReporteVentaLiberada.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }
}