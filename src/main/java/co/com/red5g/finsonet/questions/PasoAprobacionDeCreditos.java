package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_FILA_APROBACION_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoAprobacionDeCreditos implements Question<Boolean> {

  private static final String APROBACION_CREDITOS = "Apr. de créditos";

  @Override
  public Boolean answeredBy(final Actor actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNU_ORIGINACION.of(PasoAprobacionDeCreditos.APROBACION_CREDITOS)));
    return LST_FILA_APROBACION_CREDITO.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
