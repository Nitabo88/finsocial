package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TesoreriaFinsoamigoStepDefinition {

    @Dado("^que (.*) esta en el paso de tesorería finsoamigos$")
    public void ingresarTesoreria(String actor) {
        theActorCalled(actor).attemptsTo(Ingresa.aTesoreriaFinsoamigo());
    }

    @Cuando("^el asesor aprueba el crédito en tesorería finsoamitgos$")
    public void aprobarCreditoTesoreria() {
        theActorInTheSpotlight().attemptsTo(Diligencia.laAprobacionDeTesoreriaFinsoamigo());
    }

}
