package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.Consultar;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ConfirmacionStepDefinition {

  @Dado("^que (.*) quiere realizar una aprobacion de un credito$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(
        Consultar.elCredito()
    );

  }

  @Cuando("^se apruebe el paso de confirmacion$")
  public void aprobarConfirmacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeConfirmacion()
    );
  }

  @Entonces("^deberia ver el crédito en el paso de aprobacion de creditos$")
  public void verificarConfirmacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionDeDocumentos()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }
}
