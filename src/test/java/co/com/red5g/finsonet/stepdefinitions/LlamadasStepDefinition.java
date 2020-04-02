package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.LaLlamada;
import co.com.red5g.finsonet.tasks.Gestionar;
import co.com.red5g.finsonet.tasks.SeProcesa;
import co.com.red5g.finsonet.tasks.factories.Asignarse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class LlamadasStepDefinition {

  private static final String ESTADO_COMPLETO = "Visto bueno";
  private static final String ESTADO_LLAMADA = "EXITOSA";

  @Dado("que (.*) debe gestionar la llamada para un crédito de libranza")
  public void ingresarModuloLlamadas(String actor) {
    theActorCalled(actor).attemptsTo(
        Ubicarse.enLlamada()
    );
  }

  @Cuando("el asesor se asigne la gestión de la llamada del crédito de libranza")
  public void asignarLLamadaLibranza() {
    theActorInTheSpotlight().attemptsTo(
        Asignarse.laLlamadaDeLibranza()
    );
  }

  @Y("^posteriormente procese la llamada$")
  public void procesarLlamada() {
    theActorInTheSpotlight().attemptsTo(
        SeProcesa.laLlamada()
    );
  }

  @Entonces("^deberá ver que la llamada quedo confirmada$")
  public void confirmarLlamada() {
    theActorInTheSpotlight().should
        (seeThat(LaLlamada.estaConfirmada(), containsString(ESTADO_COMPLETO)));
  }

  @Dado("^que (.*) debe gestionar la llamada para un crédito finsoamigo$")
  public void ingresarModuloLlamada(String actor) {
    theActorCalled(actor).attemptsTo(
        Ubicarse.enLlamadaFinsoamigo()
    );
  }

  @Cuando("^el asesor se asigne la gestión de la llamada para un credito finsoamigo$")
  public void asignarLlamadaFinsoamigo() {
    theActorInTheSpotlight().attemptsTo(
        Asignarse.laLlamadaDeFinsoamigo()
    );
  }

  @Y("^posteriormente procese la llamada del credito finsoamigo$")
  public void gestionarLlamadaFinsoamigo() {
    theActorInTheSpotlight().attemptsTo(
        Gestionar.laLlamadaFinsoamigo()
    );
  }

  @Entonces("^deberá ver que la gestión del credito finsoamigo fue exitosa$")
  public void verificarGestionLLamadaFinsoamigo() {
    theActorInTheSpotlight().should
        (seeThat(LaLlamada.fueExitosa(), containsString(ESTADO_LLAMADA)));
  }
}
