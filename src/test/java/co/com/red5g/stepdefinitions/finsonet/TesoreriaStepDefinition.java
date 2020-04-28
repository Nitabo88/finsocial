package co.com.red5g.stepdefinitions.finsonet;

import static co.com.red5g.models.builders.finsonet.CreditoBuilder.la;
import static co.com.red5g.models.builders.finsonet.TesoreriaBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.exceptions.finsonet.NoSeVeElCreditoException;
import co.com.red5g.questions.factories.ElCredito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
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
}
