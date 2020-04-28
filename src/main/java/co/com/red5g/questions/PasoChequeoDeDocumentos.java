package co.com.red5g.questions;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoChequeoDeDocumentos implements Question<Boolean> {

  private static final String CHEQUEO_DOCUMENTOS = "Chequeo Docs";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNM_ORIGINACION.of(CHEQUEO_DOCUMENTOS)));
    return LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
