package co.com.red5g.questions;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.LST_FILA_APROBACION_CREDITO_HUY;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class AprobacionCreditoHuy implements Question<Boolean> {

  private static final String APROBACION = "Apr. de créditos";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNM_ORIGINACION.of(APROBACION)),
        MoveMouse.to(LST_FILA_APROBACION_CREDITO_HUY.of(numeroCredito)));
    return LST_FILA_APROBACION_CREDITO_HUY.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
