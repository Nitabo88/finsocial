package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_FILA_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class PasoFormalizacion implements Question<Boolean> {

  private static final String FORMALIZACION = "Formalización";

  @Override
  public Boolean answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            Click.on(MNM_HAMBURGUESA),
            Click.on(MNM_NUEVO_ORIGINACION.of(PasoFormalizacion.FORMALIZACION)),
            MoveMouse.to(LST_FILA_FORMALIZACION.of(numeroCredito)));
    return LST_FILA_FORMALIZACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}