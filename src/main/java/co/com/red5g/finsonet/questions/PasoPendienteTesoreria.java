package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_PENDIENTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoPendienteTesoreria implements Question<Boolean> {

  private final static Integer TIEMPO = 100;

  @Override
  public Boolean answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
    return LST_FILA_TESORERIA_PENDIENTE.of(numeroCredito).resolveFor(actor).isPresent();
  }
}
