package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_LLAMADAS;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.tasks.factories.finsonet.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LlamadaFinsoamigo implements Task {

  private static final int TIEMPO = 150;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        WaitFor.seconds(3),
        WaitUntil.the(LNK_LLAMADAS, isEnabled()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LNK_LLAMADAS),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds()
    );
  }
}
