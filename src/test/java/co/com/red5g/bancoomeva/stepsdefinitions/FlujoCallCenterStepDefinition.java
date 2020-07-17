package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

public class FlujoCallCenterStepDefinition {

  @Dado("^que (.*) quiere acceder a un crédito por el call center$")
  public void ingresarFlujoCallCenter(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.alFlujodeCallCenter(con().unColaborador()));
  }

  @Cuando("^el asesor call center diligencia los tres pasos de crédito en línea$")
  public void diligenciarPasosGestion() {
    theActorInTheSpotlight().attemptsTo(Diligencia.losPasosDeCreditoEnLinea());
  }
}
