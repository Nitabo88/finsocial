package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.BancaExpressLoginPage.LBL_BIENVENIDO;

import co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class PaginaPrincipalBancomeva implements Task {

  private BancoomevaHomePage homePage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Open.browserOn(homePage),
        Ensure.that(LBL_BIENVENIDO).isDisplayed());
  }
}
