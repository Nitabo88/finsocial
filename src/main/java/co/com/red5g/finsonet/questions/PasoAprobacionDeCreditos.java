package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_FILA_APROBACION_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoAprobacionDeCreditos implements Question<Boolean> {

  private static final String APROBACION_CREDITOS = "Apr. de créditos";

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.attemptsTo(
        Click.on(MNU_ORIGINACION.of(APROBACION_CREDITOS)));
    SeleccionarFila lstFila = seleccionarFila(LST_FILA_APROBACION_CREDITO, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO));
    return lstFila.answeredBy(actor).isPresent();
  }
}
