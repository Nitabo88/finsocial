package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCredito.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.ConfirmacionBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCredito;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ConfirmacionStepDefinition {

  @Dado("^que (.*) esta en el paso de confirmacion$")
  public void consultarCredito(final String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnConfirmacion()
    );
  }

  @Cuando("^el asesor apruebe el paso de confirmacion$")
  public void aprobarConfirmacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeConfirmacion()
    );
  }

  @Entonces("^el asesor deberia ver el crédito en el paso de aprobacion de creditos$")
  public void verificarAprobacionConfirmacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionDeDocumentos()).orComplainWith(NoSeVeElCredito.class, MENSAJE_CREDITO));
  }

  @Cuando("^el asesor regresa el credito a chequeo de documentos$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeConfirmacion(con().motivo())
    );
  }

  @Entonces("^el asesor debera ver el credito en el paso de chequeo de documentos$")
  public void verificarRegresoChequeoDocumento() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enChequeoDeDocumentos()).orComplainWith(NoSeVeElCredito.class, MENSAJE_CREDITO));
  }

}