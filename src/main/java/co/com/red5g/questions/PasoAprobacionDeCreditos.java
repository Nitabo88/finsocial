package co.com.red5g.questions;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.LST_FILA_APROBACION_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoAprobacionDeCreditos implements Question<Boolean> {

  private static final String APROBACION_CREDITOS = "Apr. de créditos";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNM_ORIGINACION.of(APROBACION_CREDITOS)));
    return LST_FILA_APROBACION_CREDITO.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
