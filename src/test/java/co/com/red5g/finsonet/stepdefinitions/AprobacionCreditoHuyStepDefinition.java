package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.models.builders.AprobacionCreditoBuilder.con;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.Normalizar;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class AprobacionCreditoHuyStepDefinition {

  @Dado("^que (.*) quiere (.*) un crédito huy en aprobación de créditos$")
  public void consultarCredito(final String actor, String accion) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditosHuy(la().informacionAprobacionHuy())
    );
  }

  @Cuando("^el asesor normalice el crédito$")
  public void normalizarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Normalizar.elCredito()
    );
  }

  @Cuando("^el asesor diligencia la información de aprobación de crédito huy$")
  public void diligenciarInformacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laAprobacionDelCreditonEnIncorporacionHuy()
    );
  }

  @Entonces("^el podrá ver el crédito en incorporación huy$")
  public void verificarCredito() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enIncorporacion()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }

  @Y("^el crédito se ponga en la lista de pendientes$")
  public void marcarCreditoPendiente() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.laInformacionDeCreditoHuyPendiente(con().motivoPendiente())
    );
  }

  @Entonces("^el podrá ver el crédito en pendiente por documentación$")
  public void verificarCreditoPendiente() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enPendientesAprobacionCreditoHuy()).orComplainWith(NoSeVeElCreditoException.class, MENSAJE_CREDITO));
  }
}
