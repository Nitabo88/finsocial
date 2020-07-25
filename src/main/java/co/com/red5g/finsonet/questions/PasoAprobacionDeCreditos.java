package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_FILA_APROBACION_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class PasoAprobacionDeCreditos implements Question<Boolean> {

  private static final String APROBACION_CREDITOS = "Apr. de créditos";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNM_ORIGINACION.of(APROBACION_CREDITOS)),
        MoveMouse.to(LST_FILA_APROBACION_CREDITO.of(numeroCredito)));
    return LST_FILA_APROBACION_CREDITO.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
