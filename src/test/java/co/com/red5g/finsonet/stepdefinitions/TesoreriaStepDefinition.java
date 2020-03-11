package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
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

  @Dado("^que (.*) esta en el paso de tesoreria$")
  public void ingresarTesoreria(String actor) {
    theActorCalled(actor).attemptsTo(Consulta.elCreditoEnTesoreria());
  }

  @Cuando("^el asesor regresa el credito desde tesoreria$")
  public void regresarCredito() {
    theActorInTheSpotlight()
        .attemptsTo(Diligencia.laInformacionDeRegresoDeTesoreria(con().motivoRegreso()));
  }

  @Cuando("^el asesor pone el credito como pendiente en tesoreria$")
  public void creditoPendiente() {
    theActorInTheSpotlight()
        .attemptsTo(Diligencia.laInformacionTesoreriaPendiente(con().motivoPendiente()));
  }

  @Entonces("^el asesor debera ver el credito en tesoreria en la lista de pendientes$")
  public void verificarCreditoPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enListaPendienteDeTesoreria()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }
}
