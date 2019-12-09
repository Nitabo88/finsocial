package co.com.red5g.finsonet.stepdefinitions;

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

}
