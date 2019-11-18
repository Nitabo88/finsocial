package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.Diligenciar;
import co.com.red5g.finsonet.tasks.Ubicarse;
import co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioSolicitudStepDefinition {
    private LoginFinsocialPage loginFinsocialPage;

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Dado("que un (.*) quiere llenar el formulario de solicitud de credito")
    public void ingresarFormularioSolicitud(String actor) {
        theActorCalled(actor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().attemptsTo(
                Ubicarse.enElFormulario()
        );
    }

    @Cuando("diligencia el formulario de un cliente en su totalidad")
    public void diligenciaElFormularioDeUnClienteEnSuTotalidad() {
        theActorInTheSpotlight().attemptsTo(
                Diligenciar.laSolicitudDeCredito()
        );
        
    }

    @Entonces("el debería visualizar el credito del cliente")
    public void elDeberíaVisualizarElCreditoDelCliente() {
    }
}