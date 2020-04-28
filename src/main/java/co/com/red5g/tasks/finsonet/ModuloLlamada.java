package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_LLAMADAS;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_HAMBURGUESA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.tasks.factories.finsonet.Asignarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ModuloLlamada implements Task {

  private static final int TIEMPO = 20;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(MNM_HAMBURGUESA),
        Click.on(IMG_FINSONET),
        WaitFor.seconds(3),
        WaitUntil.the(LNK_LLAMADAS, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LNK_LLAMADAS),
        Asignarse.laLlamadaDeLibranza(),
        Gestionar.laLlamada());
  }
}
