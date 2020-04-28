package co.com.red5g.stepdefinitions.finsonet;

import static co.com.red5g.models.builders.finsonet.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.questions.factories.LaLlamada;
import co.com.red5g.tasks.finsonet.Gestionar;
import co.com.red5g.tasks.factories.finsonet.Asignarse;
import co.com.red5g.tasks.factories.finsonet.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;

public class LlamadasStepDefinition {

  private static final String ESTADO_COMPLETO = "Visto bueno";
  private static final String ESTADO_LLAMADA = "EXITOSA";

  @Dado("que (.*) debe gestionar la llamada para un crédito de libranza")
  public void ingresarLlamadasLibranza(String actor) {
    theActorCalled(actor).attemptsTo(
        Ubicarse.enLlamada(la().informacionDelCreditoLlamadaLibranza())
    );
  }

  @Cuando("el asesor se asigne la gestión de la llamada del crédito de libranza")
  public void asignarLLamadaLibranza() {
    theActorInTheSpotlight().attemptsTo(
        Asignarse.laLlamadaDeLibranza()
    );
  }

  @Entonces("^deberá ver que la llamada quedo confirmada$")
  public void confirmarLlamada() {
    theActorInTheSpotlight().should
        (GivenWhenThen.seeThat(LaLlamada.estaConfirmada(), containsString(ESTADO_COMPLETO)));
  }

  @Dado("^que (.*) debe gestionar la llamada para un crédito finsoamigo$")
  public void ingresarLlamadaFinsoamigo(String actor) {
    theActorCalled(actor).attemptsTo(
        Ubicarse.enLlamadaFinsoamigo()
    );
  }

  @Cuando("^el asesor se asigne la gestión de la llamada para un crédito finsoamigo$")
  public void asignarLlamadaFinsoamigo() {
    theActorInTheSpotlight().attemptsTo(
        Asignarse.laLlamadaDeFinsoamigo()
    );
  }

  @Y("^posteriormente procese la llamada del crédito (.*)$")
  public void gestionarLlamadaFinsoamigo(String tipoCredito) {
    theActorInTheSpotlight().attemptsTo(
        Gestionar.laLlamada()
    );
  }

  @Entonces("^deberá ver que la gestión del credito (.*) fue exitosa$")
  public void verificarGestionLLamadaFinsoamigo(String llamada) {
    theActorInTheSpotlight().should
        (seeThat(LaLlamada.fueExitosa(), containsString(ESTADO_LLAMADA)));
  }

  @Dado("^que (.*) debe gestionar la llamada para un crédito Huy$")
  public void ingresarLlamadaCrediHuy(String actor) {
    theActorCalled(actor).attemptsTo(
      Ubicarse.enLlamadaCrediHuy(la().informacionDelCreditoLlamadaCrediHuy())
  );
  }

  @Cuando("^el asesor se asigne la gestión de la llamada del crédito Huy$")
  public void asignarLlamadaCrediHuy(){
    theActorInTheSpotlight().attemptsTo(
        Asignarse.laLlamadaCrediHuy()
    );
  }
}
