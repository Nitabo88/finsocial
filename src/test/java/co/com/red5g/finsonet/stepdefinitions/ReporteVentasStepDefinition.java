package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.ElDetalleNoCorrespondeException;
import co.com.red5g.finsonet.questions.ReporteAntecartera;
import co.com.red5g.finsonet.questions.ReporteOriginacion;
import co.com.red5g.finsonet.questions.ReporteVentaLiberada;
import co.com.red5g.finsonet.questions.ReporteVentaNueva;
import co.com.red5g.finsonet.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.red5g.finsonet.exceptions.ElDetalleNoCorrespondeException.MENSAJE_REPORTE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReporteVentasStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Dado("que un (.*) quiere consultar un reporte")
    public void ingresarReportes(String strActor) {
        theActorCalled(strActor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().attemptsTo(
                ConsultaUnReporte.de()
        );
    }

    @Cuando("el ingresa al reporte del mes de originacion")
    public void consultarReporteOriginacion() {
        theActorInTheSpotlight().attemptsTo(
                VeElDetalleDeOriginacion.enElReporte()
        );
    }

    @Cuando("el ingresa al reporte del mes de antecartera")
    public void consultarReporteAntecartera() {
        theActorInTheSpotlight().attemptsTo(
                VeElDetalleDeAntecartera.enElReporte()
        );
    }

    @Cuando("el ingresa al reporte del mes de venta nueva")
    public void consultarReporteVentaNueva() {
        theActorInTheSpotlight().attemptsTo(
                VeElDetalleDeVentaNueva.enElReporte()
        );
    }

    @Cuando("el ingresa al reporte del mes de venta liberada")
    public void consultarVentaLiberada() {
        theActorInTheSpotlight().attemptsTo(
                VeElDetalleDeVentaLiberada.enElReporte()
        );
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de originacion son consistentes")
    public void verificarReporteOriginacion(){
        theActorInTheSpotlight().should(seeThat(ReporteOriginacion.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de antecartera son consistentes")
    public void verificarReporteAntecartera(){
        theActorInTheSpotlight().should(seeThat(ReporteAntecartera.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de venta nueva son consistentes")
    public void verificarReporteVentaNueva(){
        theActorInTheSpotlight().should(seeThat(ReporteVentaNueva.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de venta liberada son consistentes")
    public void verificarReporteVentaLiberada(){
        theActorInTheSpotlight().should(seeThat(ReporteVentaLiberada.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
    }
}