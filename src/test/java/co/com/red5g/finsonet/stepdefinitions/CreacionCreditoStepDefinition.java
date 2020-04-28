package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CreacionCreditoStepDefinition {

    private static final String ESTADO_NO_EXITOSO = "toda la información";

    @Dado("que un (.*) quiere crear un crédito de libranza")
    public void crearCredito(String actor) {
        theActorCalled(actor).attemptsTo(
            Loguearse.enFinsonet(),
            Ubicarse.enNuevoCredito());
    }

    @Dado("que (.*) debe crear un crédito Huy")
    public void crearCreditoHuy(String actor) {
        theActorCalled(actor).attemptsTo(
            Ingresa.enNuevoCreditoHuy());
    }

    @Cuando("el ingresa el número de documento (.*) con el valor (.*) y a un plazo de (.*) meses")
    public void ingresarInformacionCredito(String strNumeroDocumento, String strValorCuota, String strPlazo) {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.laInformacionDelCredito(la().informacionDelCredito(strNumeroDocumento, strValorCuota, strPlazo))
        );
    }

    @Cuando("el asesor ingresa la información del crédito")
    public void ingresarInformacionCreditoHuy() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.laInformacionDelCreditoHuy(la().informacionDelCreditoHuy())
        );
    }

    @Entonces("el podrá ver un crédito de libranza creado")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(ElCredito.deLibranzaExiste()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
    }

    @Entonces("el podrá ver un crédito Huy creado")
    public void verificarCreacionCreditoHuy() {
        theActorInTheSpotlight().should(seeThat(ElCredito.huyExiste()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
    }

    @Entonces("el no podrá crear un crédito")
    public void verificarNoCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(ElCredito.deLibranzaNoExiste(), containsString(ESTADO_NO_EXITOSO)));
    }
}