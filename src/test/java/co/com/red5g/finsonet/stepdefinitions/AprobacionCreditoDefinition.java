package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.AprobacionCreditoBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.Aprobar;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class AprobacionCreditoDefinition {

  @Dado("^que (.*) esta en el paso de aprobacion de creditos$")
  public void consultarCredito(String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditos()
    );
  }

  @Cuando("^el asesor regresa el credito a confirmacion$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeAprobacionDeCredito(con().motivoRegreso())
    );

  }

  @Entonces("^el asesor debera ver el credito en el paso de confirmacion$")
  public void verificarCreditoConfirmacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enConfirmacion()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Cuando("^el asesor pone el credito como pendiente$")
  public void marcarCreditoPendiente() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeCreditoPendiente(con().motivoPendiente())
    );

  }

  @Entonces("^el asesor debera ver el credito en aprobacion de creditos en la lista de pendientes$")
  public void verificarCreditoListaPendientes() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enPendientesAprobacionCredito()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Cuando("^el asesor aprueba el credito$")
  public void aprobarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Aprobar.elCredito(con().aprobacion())
    );
  }
}