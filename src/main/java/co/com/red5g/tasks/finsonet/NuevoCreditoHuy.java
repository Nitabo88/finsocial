package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ComercialPage.LNK_NUEVO_CREDITO_HUY;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_COMERCIAL;

import co.com.red5g.tasks.factories.finsonet.Loguearse;
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
