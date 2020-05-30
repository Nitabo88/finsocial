package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.userinterfaces.PruebaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class PDF implements Task {

  private PruebaPage pruebaPage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        Open.browserOn(pruebaPage)
    );
  }
}
