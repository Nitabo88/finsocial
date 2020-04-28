package co.com.red5g.finsonet.tasks;


import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.MNM_APROBACION_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.MNM_HAMBURGUESA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class Aprobacion implements Task {

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        JavaScriptClick.on(MNM_HAMBURGUESA),
        JavaScriptClick.on(MNM_APROBACION_CREDITO)
    );
  }
}
