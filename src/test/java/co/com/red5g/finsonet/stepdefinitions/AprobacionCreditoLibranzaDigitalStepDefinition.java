package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Dado;

public class AprobacionCreditoLibranzaDigitalStepDefinition {

  @Dado("^que (.*) esta en el paso de aprobación de créditos de libranza digital$")
  public void queUnAsesorEstaEnElPasoDeAprobaciónDeCréditosDeLibranzaDigital(String actor) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aAprobacionDeLibranzaDigital());
  }
}

