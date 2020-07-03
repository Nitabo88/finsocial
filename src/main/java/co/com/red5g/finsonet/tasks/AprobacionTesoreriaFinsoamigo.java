package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_FINSOAMIGO1;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_NOMBRE_TESORERIA_FINSOAMIGO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionTesoreriaFinsoamigo implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds());
    String numeroCredito = LST_FILA_TESORERIA_FINSOAMIGO1.resolveFor(actor).getText();
    actor.attemptsTo(Click.on(LST_NOMBRE_TESORERIA_FINSOAMIGO.of(numeroCredito)));
  }
}
