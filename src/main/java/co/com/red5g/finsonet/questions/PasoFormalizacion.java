package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_FILA_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_400;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoFormalizacion implements Question<Boolean> {

  private static final String FORMALIZACION = "Formalización";

  @Override
  public Boolean answeredBy(final Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(MNM_HAMBURGUESA),
        JavaScriptClick.on(MNM_NUEVO_ORIGINACION.of(PasoFormalizacion.FORMALIZACION)),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_400).seconds());
    actor.attemptsTo(
        Scroll.to(LST_FILA_FORMALIZACION.of(numeroCredito)).andAlignToBottom());
    return LST_FILA_FORMALIZACION.of(numeroCredito).resolveFor(actor).isPresent();
  }
}