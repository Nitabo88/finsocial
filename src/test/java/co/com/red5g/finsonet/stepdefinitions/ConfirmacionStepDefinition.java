package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.ConfirmacionBuilder.con;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
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

public class ConfirmacionStepDefinition {

  @Dado("^que (.*) esta en el paso de confirmación$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnConfirmacion(la().informacionDelCreditoConfirmacion())
    );
  }

  @Cuando("^el asesor apruebe el paso de confirmación$")
  public void aprobarConfirmacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeConfirmacion()
    );
  }

  @Cuando("^el asesor marque como pendiente el paso de confirmación$")
  public void confirmacionPendiente() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDePendienteConfirmacion(con().motivoPendiente())
    );
  }

  @Cuando("^el asesor regresa el crédito a chequeo de documentos$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeConfirmacion(con().motivoRegreso())
    );
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de chequeo de documentos$")
  public void verificarRegresoChequeoDocumento() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enChequeoDeDocumentos()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberá ver el crédito en confirmación de créditos en la lista de pendientes$")
  public void verificarConfirmacionPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacionPendiente()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de aprobación de creditos$")
  public void verificarAprobacionConfirmacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionDeDocumentos()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }

}