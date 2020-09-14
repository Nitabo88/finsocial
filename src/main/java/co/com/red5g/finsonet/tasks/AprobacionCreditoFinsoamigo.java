package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_ASIGNAR_CREDITO;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_CONSULTAR_CREDITO_FINSOAMIGO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

import co.com.red5g.finsonet.models.builders.CredencialesBDBuilder;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AprobacionCreditoFinsoamigo implements Task {

  private static final String APROBACION_CREDITO = "Apr. de créditos";

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.asksFor(LaInformacion.deBaseDeDatos(CredencialesBDBuilder.con().bdCreditos(), SQL_CONSULTAR_CREDITO_FINSOAMIGO.getSql(), "id"));
    actor.remember(NUMERO_CREDITO, numeroCredito);
    actor.attemptsTo(
        Actualizar.laInformaciondeBD(CredencialesBDBuilder.con().bdCreditos(), SQL_ASIGNAR_CREDITO.getSql()),
        Ingresa.aChequeoDocumentosFinsoamigo(),
        Diligencia.laInformacionDeChequeoDeDocumentos(con().finsoamigo(), numeroCredito, LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO),
        Click.on(MNM_ORIGINACION.of(APROBACION_CREDITO))
    );
  }
}
