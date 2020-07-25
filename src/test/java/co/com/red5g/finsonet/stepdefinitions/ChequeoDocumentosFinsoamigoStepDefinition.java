package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_CONSULTAR_CREDITO_FINSOAMIGO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.models.builders.CredencialesBDBuilder;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ChequeoDocumentosFinsoamigoStepDefinition {

  @Dado("^que (.*) esta en el paso de chequeo de documentos finsoamigo$")
  public void ingresarChequeoDocumentos(String actor) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aChequeoDocumentosFinsoamigo());
  }

  @Cuando("^el asesor adjunta toda la información de el chequeo de documentos finsoamigo$")
  public void adjuntarInformacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeChequeoDeDocumentosFinsoamigo(con().finsoamigo(), theActorInTheSpotlight().asksFor(
            LaInformacion.deBaseDeDatos(CredencialesBDBuilder.con().bdCreditos(), SQL_CONSULTAR_CREDITO_FINSOAMIGO.getSql(), "id")))
    );
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de aprobación créditos finsoamigos$")
  public void verificarCreditoAprobacion() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enAprobacionCredito()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }
}
