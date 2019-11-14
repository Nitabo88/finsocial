package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.interacions.Abrir;
import co.com.red5g.finsonet.tasks.Ingresar;
import co.com.red5g.finsonet.tasks.YUbicarse;
import co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioSolicitudStepDefinition {
    private LoginFinsocialPage loginFinsocialPage;

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Dado("que un (.*) quiere llenar el formulario de solicitud de credito")
    public void queUnAsesorQuiereLlenarElFormularioDeSolicitudDeCredito(String actor) {
        theActorCalled(actor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().wasAbleTo(
                Abrir.laPaginaPrincipal(),
                Ingresar.lasCredenciales(de().unUsuarioBasico()),
                YUbicarse.enMisCreditos());
    }

    @Cuando("diligencia el formulario de un cliente en su totalidad")
    public void diligenciaElFormularioDeUnClienteEnSuTotalidad() {
        
    }

    @Entonces("el debería visualizar el credito del cliente")
    public void elDeberíaVisualizarElCreditoDelCliente() {
    }
}