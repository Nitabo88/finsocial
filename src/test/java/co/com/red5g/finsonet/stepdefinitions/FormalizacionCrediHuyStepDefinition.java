package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
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

public class FormalizacionCrediHuyStepDefinition {

    @Dado("^que (.*) esta en el paso de formalización CrediHuy$")
    public void ingresarFormalizacionCrediHuy(String actor) {
        theActorCalled(actor).attemptsTo(
                Consulta.elCreditoEnFormalizacionCrediHuy()
        );
    }

    @Cuando("^el asesor aprueba el crédito en formalización CrediHuy$")
    public void aprobarCredito() {
        theActorInTheSpotlight().attemptsTo(
                Diligencia.laAprobacionDelCreditoEnFormalizacionCrediHuy());
    }

    @Entonces("^el asesor deberá ver el crédito en el paso de tesorería crediHuy$")
    public void verificarCreditoTesoreria() {
        theActorInTheSpotlight().should(seeThat(ElCredito.enTesoreriaCrediHuy()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
    }
}
