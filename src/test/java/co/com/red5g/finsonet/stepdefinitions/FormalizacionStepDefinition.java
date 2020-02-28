package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.FormalizacionBuilder.con;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

public class FormalizacionStepDefinition {

  @Dado("^que (.*) esta en el paso de formalizacion$")
  public void consultarCredito(final String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnFormalizacion()
    );
  }

  @Cuando("^el asesor regresa el credito desde formalizacion$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeFormalizacion(con().motivoRegreso()));
  }
}