package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QueNoAparece implements Question<Boolean> {

  public static QueNoAparece laSolicitud() {
    return new QueNoAparece();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean columna = LST_FILA_CHEQUEO_DOCUMENTOS.of(actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO)).resolveFor(actor).isDisabled();
    if (columna) {
      columna = LST_FILA_CHEQUEO_DOCUMENTOS.of(actor.recall(CEDULA_ACTOR), masUnMinuto(actor.recall(FECHA_SOLICITUD_CREDITO))).resolveFor(actor).isDisabled();
    }
    return columna;
  }
}