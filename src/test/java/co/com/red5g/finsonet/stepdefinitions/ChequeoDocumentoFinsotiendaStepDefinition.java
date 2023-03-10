package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_NOMBRE_FINSOTIENDA;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_CONSULTAR_CREDITO_FINSOTIENDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.models.builders.CredencialesBDBuilder;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

public class ChequeoDocumentoFinsotiendaStepDefinition {

  @Dado("^que (.*) esta en el paso de chequeo de documentos finsotienda$")
  public void ingresarChequeoDocumentos(String actor) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aChequeoDocumentos());
  }

  @Cuando("^el asesor adjunta toda la información de el chequeo de documentos finsotienda$")
  public void adjuntarInformacion() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeChequeoDeDocumentos(con().finsoamigo(), theActorInTheSpotlight().asksFor(
            LaInformacion.deBaseDeDatos(CredencialesBDBuilder.con().bdCreditos(), SQL_CONSULTAR_CREDITO_FINSOTIENDA.getSql(), "id")), LST_CHEQUEO_NOMBRE_FINSOTIENDA)
    );
  }
}
