package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LBL_MENSAJE_DASHBOARD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class LoginBancaExpress implements Task {

  Credenciales credenciales;

  public LoginBancaExpress(Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  public static Performable ingresarEnBancaExpress(Credenciales credenciales) {
    return instrumented(LoginBancaExpress.class, credenciales);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.aBancoomeva(),
        Diligencia.lasCredencialesDeAutenticacion(credenciales));
    LBL_MENSAJE_DASHBOARD.resolveFor(actor).isPresent();
  }
}
