package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.TesoreriaBuilder.con;
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

public class TesoreriaStepDefinition {

  @Dado("^que (.*) esta en el paso de tesorería$")
  public void ingresarTesoreria(String actor) {
    theActorCalled(actor).attemptsTo(Consulta.elCreditoEnTesoreria(la().informacionDelCreditoTesoreria()));
  }

  @Cuando("^el asesor regresa el crédito desde tesorería$")
  public void regresarCredito() {
    theActorInTheSpotlight()
        .attemptsTo(Diligencia.laInformacionDeRegresoDeTesoreria(con().motivoRegreso()));
  }

  @Cuando("^el asesor pone el crédito como pendiente en tesorería$")
  public void creditoPendiente() {
    theActorInTheSpotlight()
        .attemptsTo(Diligencia.laInformacionTesoreriaPendiente(con().motivoPendiente()));
  }

  @Entonces("^el asesor deberá ver el crédito en tesorería en la lista de pendientes$")
  public void verificarCreditoPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enListaPendienteDeTesoreria()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }

  @Cuando("^el asesor aprueba el crédito en tesorería$")
  public void aprobarCredito() {
    theActorInTheSpotlight().attemptsTo(Diligencia.laInformacionDeAprobacionDeTesoreria());
  }

  @Entonces("^el asesor deberá ver el crédito en antecartera$")
  public void verificarCreditoAntecartera() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAntecartera()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }
}
