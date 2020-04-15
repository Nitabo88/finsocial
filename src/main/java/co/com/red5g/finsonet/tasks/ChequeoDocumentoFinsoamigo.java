package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChequeoDocumentoFinsoamigo implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(NUMERO_CREDITO, "90145");
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        WaitFor.seconds(3),
        Click.on(LNK_ORIGINACION)
    );
  }
}
