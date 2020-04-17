package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.AprobacionCreditoBuilder.con;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
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

public class AprobacionCreditoStepDefinition {

  @Dado("^que (.*) esta en el paso de aprobación de créditos$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditos(la().informacionDelCreditoAprobacion())
    );
  }

  @Cuando("^el asesor regresa el crédito a confirmación$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeAprobacionDeCredito(con().motivoRegreso())
    );
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de confirmación$")
  public void verificarCreditoConfirmacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacion()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Cuando("^el asesor pone el crédito como pendiente$")
  public void marcarCreditoPendiente() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeCreditoPendiente(con().motivoPendiente())
    );
  }

  @Entonces("^el asesor deberá ver el crédito en aprobación de créditos en la lista de pendientes$")
  public void verificarCreditoListaPendientes() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enPendientesAprobacionCredito()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Cuando("^el asesor aprueba el crédito$")
  public void aprobarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeAprobacionDeCredito()
    );
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de incorporación$")
  public void verificarCreditoIncorporacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enIncorporacion()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }
}