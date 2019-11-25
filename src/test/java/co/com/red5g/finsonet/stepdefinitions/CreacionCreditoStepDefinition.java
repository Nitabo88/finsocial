package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException;
import co.com.red5g.finsonet.questions.Credito;
import co.com.red5g.finsonet.tasks.Autenticarse;
import co.com.red5g.finsonet.tasks.SeUbica;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builder.CreditoBuilder.la;
import static co.com.red5g.finsonet.tasks.Ingresa.diligenciar;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreacionCreditoStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Dado("que un (.*) quiere crear un credito")
    public void crearCredito(String nombreActor) {
        theActorCalled(nombreActor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().attemptsTo(
                Autenticarse.enFinsonet(),
                SeUbica.enNuevoCredito());
    }

    @Cuando("el ingresa el numero de documento (.*) con el valor (.*) y a un plazo de (.*) meses")
    public void ingresarInformacionCredito(String strNumeroDocumento, String strValorCuota, String strPlazo) {
        theActorInTheSpotlight().attemptsTo(
                diligenciar(la().informacionDelCredito(strNumeroDocumento,strValorCuota,strPlazo))
        );
    }

    @Entonces("el podra ver un credito creado")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(Credito.existe()).orComplainWith(NoSeVeElCreditoCreadoException.class, MENSAJE_CREDITO));
    }
}