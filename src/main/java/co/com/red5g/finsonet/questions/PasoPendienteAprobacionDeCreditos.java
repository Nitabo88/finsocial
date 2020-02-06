package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_FILA_PENDIENTE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PasoPendienteAprobacionDeCreditos implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    SeleccionarFila lstFila = seleccionarFila(LST_FILA_PENDIENTE, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO));
    return lstFila.answeredBy(actor).isPresent();
  }
}
