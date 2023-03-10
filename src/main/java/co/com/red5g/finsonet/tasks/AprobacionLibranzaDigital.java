package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class AprobacionLibranzaDigital implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.aConfirmacionLibranzaDigital()
    );
  }
}
