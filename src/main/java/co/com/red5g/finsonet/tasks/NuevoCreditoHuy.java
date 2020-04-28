package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_NUEVO_CREDITO_HUY;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NuevoCreditoHuy implements Task {

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        Click.on(LNK_COMERCIAL),
        Click.on(LNK_NUEVO_CREDITO_HUY));
  }
}
