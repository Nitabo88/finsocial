package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LBL_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_FILA_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoIncorporacion implements Question<Boolean> {

  private static final String INCORPORACION = "Incorporación";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNM_ORIGINACION.of(INCORPORACION)),
        WaitUntil.the(LBL_INCORPORACION, isVisible()).forNoMoreThan(TIEMPO_120).seconds(),
        Scroll.to(LST_FILA_INCORPORACION.of(numeroCredito)).andAlignToBottom());
    return LST_FILA_INCORPORACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}