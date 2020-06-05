package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CreditoTesoreriaFinsoamigo implements Task {

  private static final String TESORERIA = "Tesorería";
  private static final int TIEMPO = 180;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        WaitFor.seconds(3),
        Click.on(LNK_ORIGINACION),
        Click.on(MNM_ORIGINACION.of(TESORERIA))
    );
  }
}
