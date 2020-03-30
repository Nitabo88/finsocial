package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.ValidarLlamada;
import co.com.red5g.finsonet.tasks.AsignacionLlamadas;
import co.com.red5g.finsonet.tasks.SeProcesa;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class LlamadasStepDefinition {

  private static final String ESTADO_COMPLETO = "Visto bueno";

  @Dado("que (.*) quiere gestiona la llamada para un credito")
  public void ingresarModuloLlamadas(String nombreActor) {
    theActorCalled(nombreActor).attemptsTo(
        Ubicarse.enLlamada()
    );
  }

  @Cuando("el asesor se asigne")
  public void asignarLLamada() {
    theActorInTheSpotlight().attemptsTo(
        AsignacionLlamadas.asignarllamada()
    );
  }

  @Y("^posteriormente procese la llamada$")
  public void procesarLlamada() {
    theActorInTheSpotlight().attemptsTo(
        SeProcesa.laLlamada()
    );
  }

  @Entonces("^la llamada para la gestion del credito quedara confirmada$")
  public void confirmarLlamada() {
    theActorInTheSpotlight().should
        (seeThat(ValidarLlamada.estaConfirmada(), containsString(ESTADO_COMPLETO)));
  }
}
