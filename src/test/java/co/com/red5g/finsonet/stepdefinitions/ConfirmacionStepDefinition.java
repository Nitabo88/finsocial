package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.ConfirmacionBuilder.con;
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

public class ConfirmacionStepDefinition {

  @Dado("^que (.*) esta en el paso de confirmacion$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnConfirmacion(la().informacionDelCreditoConfirmacion())
    );
  }

  @Cuando("^el asesor apruebe el paso de confirmacion$")
  public void aprobarConfirmacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeConfirmacion()
    );
  }

  @Cuando("^el asesor marque como pendiente el paso de confirmacion$")
  public void confirmacionPendiente() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDePendienteConfirmacion(con().motivoPendiente())
    );
  }

  @Cuando("^el asesor regresa el credito a chequeo de documentos$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeConfirmacion(con().motivoRegreso())
    );
  }

  @Entonces("^el asesor debera ver el credito en el paso de chequeo de documentos$")
  public void verificarRegresoChequeoDocumento() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enChequeoDeDocumentos()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberia ver el crédito en confirmacion de creditos en la lista de pendientes$")
  public void verificarConfirmacionPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacionPendiente()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberia ver el crédito en el paso de aprobacion de creditos$")
  public void verificarAprobacionConfirmacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionDeDocumentos()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

}