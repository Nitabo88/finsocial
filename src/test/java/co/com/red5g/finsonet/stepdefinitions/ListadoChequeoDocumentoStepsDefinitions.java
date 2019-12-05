package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.interacions.Abrir;
import co.com.red5g.finsonet.tasks.Ingresar;
import co.com.red5g.finsonet.tasks.SeDirige;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ListadoChequeoDocumentoStepsDefinitions {
    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Dado("que (.*) quiere realizar el chequeo de un documento")
    public void ListadoChequeoDocumentos(String nombreActor) {
        theActorCalled(nombreActor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().attemptsTo(
                Abrir.laPaginaPrincipal(),
                Ingresar.lasCredenciales(de().unUsuarioBasico()),
                SeDirige.AChequeoDocumento());
    }
}
