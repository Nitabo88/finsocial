package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChequeoDocumentosHuyStepDefinition {

  @Dado("^que (.*) quiere (.*) un chequeo de documentos de un crédito huy$")
  public void ingresarChequeoDocumento(String actor, String proceso) {
    theActorCalled(actor).wasAbleTo(
            Ingresa.aChequeoDocumentosHuy(la().informacionChequeoHuy())
    );
  }

  @Cuando("^ingrese toda la información del chequeo de documentos del crédito huy$")
  public void diligenciarInformacionChequeoDocumento() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.laInformacionDeChequeoDeDocumentosHuy(con().huy())
    );
  }

  @Entonces("^deberá ver el crédito en el paso de aprobación créditos Huy$")
  public void verificarCredito() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionDeCreditoHuy()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }

  @Cuando("^el asesor decline el chequeo del crédito huy del cliente$")
  public void marcarPendienteCrediHuy() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.elCreditoHuyComoPendiente(con().motivoCrediHuy())
    );
  }

  @Cuando("^el asesor niegue el chequeo de documentos del crédito huy$")
  public void negarCrediHuy() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.laNegaciondelCreditoHuy(con().motivoNegacionCrediHuy())
    );
  }
}
