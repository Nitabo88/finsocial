package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.utils.NumeroCreditoFinsoamigo.CHEQUEO_DOCUMENTO_EXITOSO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChequeoDocumentosFinsoamigoStepDefinition {

  @Dado("^que (.*) esta en el paso de chequeo de documentos finsoamigo$")
  public void ingresarChequeoDocumentos(String actor) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aChequeoDocumentosFinsoamigo());
  }

  @Cuando("^el asesor adjunta toda la información de el chequeo de documentos finsoamigo$")
  public void adjuntarInformacion() {
    theActorInTheSpotlight().attemptsTo(
            Diligencia.laInformacionDeChequeoDeDocumentosFinsoamigo(con().finsoamigo(), CHEQUEO_DOCUMENTO_EXITOSO.getNumeroCredito())
    );
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de aprobación créditos finsoamigos$")
  public void verificarCreditoAprobacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionCredito()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
  }


}
