package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoChequeoDeDocumentos implements Question<Boolean> {

  private static final String CHEQUEO_DOCUMENTOS = "Chequeo Docs";

  @Override
  public Boolean answeredBy(final Actor actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNU_ORIGINACION.of(PasoChequeoDeDocumentos.CHEQUEO_DOCUMENTOS)));
    return LST_FILA_CHEQUEO_DOCUMENTOS.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
