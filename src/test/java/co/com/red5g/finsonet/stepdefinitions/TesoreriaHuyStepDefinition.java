package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
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

}
