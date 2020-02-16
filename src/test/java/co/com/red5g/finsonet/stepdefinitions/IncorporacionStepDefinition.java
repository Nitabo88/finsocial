package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.IncorporacionBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class IncorporacionStepDefinition {

  @Dado("^que (.*) esta en el paso de incorporacion$")
  public void ingresarIncorporacion(String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnIncorporacion()
    );
  }

  @Cuando("^el asesor regresa el credito a aprobacion de creditos$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeIncorporacion(con().motivoRegreso()));
  }

  @Cuando("^el asesor pone el credito como pendiente en incorporacion$")
  public void marcarPendienteCredito() {
  }

  @Cuando("^el asesor aprueba el credito en incorporacion$")
  public void aprobarCredito() {
  }

  @Entonces("^el asesor debera ver el credito en el paso de formalizacion$")
  public void elAsesorDeberaVerElCreditoEnElPasoDeFormalizacion() {

  }

  @Entonces("^el asesor debera ver el credito en incorporacion en la lista de pendientes$")
  public void elAsesorDeberaVerElCreditoEnIncorporacionEnLaListaDePendientes() {

  }

  @Entonces("^el asesor debera ver el credito en el paso de aprobacion de creditos$")
  public void verificarElCreditoEnAprobacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionCredito()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }
}