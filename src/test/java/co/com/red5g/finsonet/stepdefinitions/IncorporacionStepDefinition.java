package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.IncorporacionBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
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
