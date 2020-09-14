package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_LIBRANZA_DIGITAL;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_CONSULTAR_CREDITO_LIBRANZA_DIGITAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.models.builders.CredencialesBDBuilder;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmacionLibranzaDigital implements Task {

  public static final String CONFIRMACION = "Confirmación";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.aChequeoDocumentos(),
        Diligencia.laInformacionDeChequeoDeDocumentos(con().libranzaDigital(), theActorInTheSpotlight().asksFor(
            LaInformacion.deBaseDeDatos(CredencialesBDBuilder.con().bdCreditos(), SQL_CONSULTAR_CREDITO_LIBRANZA_DIGITAL.getSql(), "id")), LST_CHEQUEO_DOCUMENTOS_LIBRANZA_DIGITAL),
        Click.on(MNM_ORIGINACION.of(CONFIRMACION))
    );
  }
}
