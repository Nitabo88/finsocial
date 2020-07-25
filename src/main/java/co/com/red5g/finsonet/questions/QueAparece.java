package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS_PENDIENTE;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class QueAparece implements Question<Boolean> {

  public static QueAparece laSolicitudPendiente() {
    return new QueAparece();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(MoveMouse.to(LST_FILA_CHEQUEO_DOCUMENTOS_PENDIENTE.of(numeroCredito)));
    return LST_FILA_CHEQUEO_DOCUMENTOS_PENDIENTE.of(numeroCredito).resolveFor(actor).isPresent();
  }
}