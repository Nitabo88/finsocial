package co.com.red5g.stepdefinitions.finsonet;

import co.com.red5g.exceptions.finsonet.NoSeVeElCreditoException;
import co.com.red5g.questions.factories.ElCredito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.models.builders.finsonet.CreditoBuilder.la;
import static co.com.red5g.models.builders.finsonet.IncorporacionBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IncorporacionStepDefinition {

  @Dado("^que (.*) esta en el paso de incorporación$")
  public void ingresarIncorporacion(final String actor) {
    theActorCalled(actor).attemptsTo(
            Consulta.elCreditoEnIncorporacion(la().informacionDelCreditoIncorporacion())
    );
  }

  @Cuando("^el asesor regresa el crédito a aprobación de créditos$")
  public void regresarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeRegresoDeIncorporacion(con().motivoRegreso()));
  }

  @Cuando("^el asesor pone el crédito como pendiente en incorporación$")
  public void marcarPendienteCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeCreditoPendienteEnIncorporacion(con().motivoPendiente()));
  }

  @Cuando("^el asesor aprueba el crédito en incorporación$")
  public void aprobarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laAprobacionDelCreditoEnIncorporacion(con().aprobacion()));
  }

  @Entonces("^el asesor debera ver el crédito en el paso de aprobación de créditos$")
  public void verificarElCreditoEnAprobacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionCredito()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de formalización$")
  public void verificarCreditoEnFormalizacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enLaListDeFormalizacion()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberá ver el crédito en incorporación en la lista de pendientes$")
  public void verificarElCreditoEnPendienteAprobacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enLaListaPendienteDeIncorporacion()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }
}
