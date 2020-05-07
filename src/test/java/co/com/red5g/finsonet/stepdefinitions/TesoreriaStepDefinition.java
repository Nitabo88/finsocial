package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.TesoreriaBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;

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

  @Dado("^que (.*) esta en el paso de tesorería prueba$")
  public void queUnAsesorEstaEnElPasoDeTesoreríaPrueba(String actor) {
    theActorCalled(actor).attemptsTo(
            Loguearse.enFinsonet(),
            Click.on(LNK_ORIGINACION),
            Click.on(MNM_ORIGINACION.of("Tesorería")));
  }
}
