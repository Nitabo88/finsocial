package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import cucumber.api.java.es.Dado;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class FormalizacionCrediHuyStepDefinition {

    @Dado("^que (.*) esta en el paso de formalización CrediHuy$")
    public void ingresarFormalizacionCrediHuy(String actor) {
        theActorCalled(actor).attemptsTo(
                Consulta.elCreditoEnFormalizacionCrediHuy(la().informacionIncorporacionHuy())
        );
    }
}
