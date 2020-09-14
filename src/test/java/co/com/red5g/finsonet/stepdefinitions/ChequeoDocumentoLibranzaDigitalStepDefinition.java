package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_LIBRANZA_DIGITAL;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_CONSULTAR_CREDITO_LIBRANZA_DIGITAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.models.builders.CredencialesBDBuilder;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

public class ChequeoDocumentoLibranzaDigitalStepDefinition {

  @Dado("^que (.*) esta en el paso de chequeo de documentos de un crédito de libranza digital$")
  public void ingresarChequeoDocumentos(String actor) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aChequeoDocumentos());
  }

  @Cuando("^el asesor adjunta toda la información del chequeo de documentos$")
  public void adjuntarInformacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeChequeoDeDocumentos(con().libranzaDigital(), theActorInTheSpotlight().asksFor(
            LaInformacion.deBaseDeDatos(CredencialesBDBuilder.con().bdCreditos(), SQL_CONSULTAR_CREDITO_LIBRANZA_DIGITAL.getSql(), "id")), LST_CHEQUEO_DOCUMENTOS_LIBRANZA_DIGITAL)
    );
  }
}
