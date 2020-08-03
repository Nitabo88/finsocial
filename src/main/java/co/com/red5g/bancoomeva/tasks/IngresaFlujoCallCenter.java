package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.LoginBancaExpress.ingresarEnBancaExpress;
import static co.com.red5g.bancoomeva.userinterfaces.CallCenterPage.LNK_FLUJO_CALL_CENTER;
import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LNK_CALL_CENTER;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaFlujoCallCenter implements Task {

  Credenciales credenciales;

  public IngresaFlujoCallCenter(Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ingresarEnBancaExpress(credenciales),
        Click.on(LNK_CALL_CENTER),
        Click.on(LNK_FLUJO_CALL_CENTER)
    );
  }
}
