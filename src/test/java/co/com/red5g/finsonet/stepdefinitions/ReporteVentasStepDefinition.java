package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoException;
import co.com.red5g.finsonet.interacions.Abrir;
import co.com.red5g.finsonet.questions.Mensaje;
import co.com.red5g.finsonet.questions.Reporte;
import co.com.red5g.finsonet.tasks.Ingresar;
import co.com.red5g.finsonet.tasks.Navegar;
import co.com.red5g.finsonet.tasks.Seleccionar;
import co.com.red5g.finsonet.tasks.Visualizar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoException.MENSAJE_LOGUEO_NO_EXITOSO;
import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
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
                Abrir.laPaginaPrincipal(),
                Ingresar.lasCredenciales(de().unUsuarioBasico()),
                Navegar.AlosReportesDeVenta());
    }

    @Cuando("el ingresa al reporte del (.*) de originacion")
    public void consultarReporte(String strFechaReporte) {
        theActorInTheSpotlight().attemptsTo(
                Seleccionar.laFechaDeReporte(strFechaReporte),
                Visualizar.elReporteDeOriginacion());
    }

    @Entonces("el observara que el consolidado y el detalle del reporte de originacion son consistentes")
    public void verificarReporte(){
        theActorInTheSpotlight().should(seeThat(Reporte.deOriginacion()));
    }
}