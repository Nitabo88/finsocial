package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.FormalizacionBuilder.con;
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

public class FormalizacionStepDefinition {

  @Dado("^que (.*) esta en el paso de formalizacion$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(Consulta.elCreditoEnFormalizacion(la().informacionDelCreditoFormalizacion()));
  }

  @Cuando("^el asesor regresa el credito desde formalizacion$")
  public void regresarCredito() {
    theActorInTheSpotlight()
        .attemptsTo(Diligencia.laInformacionDeRegresoDeFormalizacion(con().motivoRegreso()));
  }

  @Cuando("^el asesor pone el credito como pendiente en formalizacion$")
  public void creditoPendiente() {
    theActorInTheSpotlight()
            .attemptsTo(Diligencia.laInformacionFormalizacionPendiente(con().motivoPendiente()));
  }

  @Entonces("^el asesor debera ver el credito en formalizacion en la lista de pendientes$")
  public void verificarCreditoPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enListaPendienteDeFormalizacion()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Cuando("^el asesor aprueba el credito en formalizacion$")
  public void aprobarCredito() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.laAprobacionDelCreditoEnFormalizacion());
  }

  @Entonces("^el asesor debera ver el credito en el paso de tesoreria$")
  public void verificarCredito() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enTesoreria()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }
}