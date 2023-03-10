package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TesoreriaHuyStepDefinition {

    @Dado("^que (.*) esta en el paso de tesorería credihuy$")
    public void ingresarTesoreria(String actor) {
        theActorCalled(actor).attemptsTo(Consulta.elCreditoEnTesoreriaCrediHuy(la().informacionDelCreditoTesoreriaCrediHuy()));
    }

    @Cuando("^el asesor aprueba el crédito en tesorería credihuy$")
    public void aprobarCredito() {
        theActorInTheSpotlight().attemptsTo(Diligencia.laInformacionDeAprobacionDeTesoreriaCrediHuy());
    }

    @Entonces("^el asesor deberá ver el crédito en cartera$")
    public void verificarCredito() {
        theActorInTheSpotlight().should(seeThat(ElCredito.enCartera()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
    }

}
