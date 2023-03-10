package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.FormalizacionBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class FormalizacionStepDefinition {

  @Dado("^que (.*) esta en el paso de formalización$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(Consulta.elCreditoEnFormalizacion(la().informacionDelCreditoFormalizacion()));
  }

  @Cuando("^el asesor regresa el crédito desde formalización$")
  public void regresarCredito() {
    theActorInTheSpotlight()
        .attemptsTo(Diligencia.laInformacionDeRegresoDeFormalizacion(con().motivoRegreso()));
  }

  @Cuando("^el asesor pone el crédito como pendiente en formalización$")
  public void creditoPendiente() {
    theActorInTheSpotlight()
            .attemptsTo(Diligencia.laInformacionFormalizacionPendiente(con().motivoPendiente()));
  }

  @Entonces("^el asesor deberá ver el crédito en formalización en la lista de pendientes$")
  public void verificarCreditoPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enListaPendienteDeFormalizacion()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }

  @Cuando("^el asesor aprueba el crédito en formalización$")
  public void aprobarCredito() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.laAprobacionDelCreditoEnFormalizacion());
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de tesorería$")
  public void verificarCredito() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enTesoreria()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }
}