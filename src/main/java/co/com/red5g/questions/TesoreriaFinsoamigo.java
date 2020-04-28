package co.com.red5g.questions;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.userinterfaces.finsonet.TesoreriaPage.LST_FILA_TESORERIA_FINSOAMIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TesoreriaFinsoamigo implements Question<Boolean> {

  private static final int TIEMPO = 120;
  private static final String TESORERIA = "Tesorería";

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(MNM_ORIGINACION.of(TESORERIA)),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
        MoveMouse.to(LST_FILA_TESORERIA_FINSOAMIGO.of(numeroCredito)));
    return LST_FILA_TESORERIA_FINSOAMIGO.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
