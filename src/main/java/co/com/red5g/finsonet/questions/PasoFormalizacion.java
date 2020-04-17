package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_FILA_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LBL_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoFormalizacion implements Question<Boolean> {

  private static final String FORMALIZACION = "Formalización";
  private static final int TIEMPO = 200;

  @Override
  public Boolean answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(LBL_INCORPORACION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(MNM_HAMBURGUESA),
        Click.on(MNM_NUEVO_ORIGINACION.of(PasoFormalizacion.FORMALIZACION)));
    return LST_FILA_FORMALIZACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}