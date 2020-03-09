package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_FILA_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_NUEVO_ORIGINACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class PasoFormalizacion implements Question<Boolean> {

  private static final String FORMALIZACION = "Formalización";

  @Override
  public Boolean answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNU_HAMBURGUESA),
        Click.on(MNU_NUEVO_ORIGINACION.of(PasoFormalizacion.FORMALIZACION)));
    return LST_FILA_FORMALIZACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}