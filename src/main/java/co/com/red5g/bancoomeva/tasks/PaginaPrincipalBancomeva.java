package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.BancaExpressLoginPage.LBL_BIENVENIDO;

import co.com.red5g.bancoomeva.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class PaginaPrincipalBancomeva implements Task {

  private HomePage homePage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(homePage));
    LBL_BIENVENIDO.resolveFor(actor).isPresent();
  }
}
