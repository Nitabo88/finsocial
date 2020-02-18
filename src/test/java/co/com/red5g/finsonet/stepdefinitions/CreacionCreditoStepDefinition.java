package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCredito.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.exceptions.NoSeVeElCredito;
import co.com.red5g.finsonet.questions.Credito;
import co.com.red5g.finsonet.questions.LaNoCreacionDelCredito;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CreacionCreditoStepDefinition {
    private static final String ESTADO_NO_EXITOSO = "toda la información";

    @Dado("que un (.*) quiere crear un credito")
    public void crearCredito(final String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Loguearse.enFinsonet(),
                Ubicarse.enNuevoCredito());
    }

    @Dado("que un (.*) debe crear un credito tipo huy")
    public void crearCreditoHuy(final String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
            Loguearse.enFinsonet(),
            Ubicarse.enNuevoCreditoHuy());
    }

    @Cuando("el ingresa el numero de documento (.*) con el valor (.*) y a un plazo de (.*) meses")
    public void ingresarInformacionCredito(final String strNumeroDocumento, final String strValorCuota, final String strPlazo) {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.laInformacionDelCredito(la().informacionDelCredito(strNumeroDocumento, strValorCuota, strPlazo))
        );
    }

    @Cuando("el asesor ingresa la informacion del credito")
    public void ingresarInformacionCreditoHuy() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.laInformacionDelCreditoHuy(la().informacionDelCreditoHuy())
        );
    }

    @Entonces("el podra ver un credito creado")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(Credito.existe()).orComplainWith(NoSeVeElCredito.class, MENSAJE_CREDITO));
    }

    @Entonces("el podra ver un credito huy creado")
    public void verificarCreacionCreditoHuy() {
        theActorInTheSpotlight().should(seeThat(Credito.existe()).orComplainWith(NoSeVeElCredito.class, MENSAJE_CREDITO));
    }

    @Entonces("el no podra crear un credito")
    public void verificarNoCreacionCredito() {
        theActorInTheSpotlight().should(seeThat(LaNoCreacionDelCredito.valor(), containsString(CreacionCreditoStepDefinition.ESTADO_NO_EXITOSO)));
    }
}