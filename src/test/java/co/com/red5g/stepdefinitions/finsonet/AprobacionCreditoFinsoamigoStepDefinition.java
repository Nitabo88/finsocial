package co.com.red5g.stepdefinitions.finsonet;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.exceptions.finsonet.NoSeVeElCreditoException;
import co.com.red5g.questions.factories.ElCredito;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class AprobacionCreditoFinsoamigoStepDefinition {

  @Dado("^que (.*) esta en el paso de aprobación de créditos finsoamigo$")
  public void ingresarAprobacionCreditos(String actor) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aAprobacionFinsoamigo());
  }

  @Cuando("^el asesor diligencia la información de aprobación de crédito finsoamigo$")
  public void diligenciarInformacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeAprobacionDeCreditoFinsoamigo()
    );
  }

  @Entonces("^deberá ver el crédito en el paso de tesorería de finsoamigos$")
  public void verificarCreditoTesoreria() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enTesoreriaFinsoamigo()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }
}
