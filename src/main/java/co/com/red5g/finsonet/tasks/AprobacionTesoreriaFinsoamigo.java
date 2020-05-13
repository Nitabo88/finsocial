package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_FINSOAMIGO1;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_NOMBRE_TESORERIA_FINSOAMIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AprobacionTesoreriaFinsoamigo implements Task {
  private static final int TIEMPO = 200;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
    String numeroCredito = LST_FILA_TESORERIA_FINSOAMIGO1.resolveFor(actor).getText();
    actor.attemptsTo(Click.on(LST_NOMBRE_TESORERIA_FINSOAMIGO.of(numeroCredito)));
  }
}
