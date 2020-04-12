package co.com.red5g.finsonet.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaCreditoStepDefinition {
    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;

    @Before
    public void configureBaseUrl() {
        theRestApiBaseUrl = environmentVariables.getProperty("webdriver.base.url");
    }


    @Dado("que (.*) quiere conocer los créditos en curso de un cliente")
    public void ingresarSistema(String actor) {
        theActorCalled(actor).whoCan(CallAnApi.at(theRestApiBaseUrl));
        theActorInTheSpotlight().attemptsTo(
                Get.resource("login.php")
        );
    }

    @Cuando("^el administrador ingresa la información del cliente$")
    public void diligenciarInformacionCliente() {

    }

    @Entonces("^el podrá ver los creditos en curso$")
    public void verificarCreditos() {
    }
}
