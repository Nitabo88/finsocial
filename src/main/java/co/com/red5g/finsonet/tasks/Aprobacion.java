package co.com.red5g.finsonet.tasks;


import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.MNU_APROBACION_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.MNU_HAMBURGUESA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class Aprobacion implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        JavaScriptClick.on(MNU_HAMBURGUESA),
        JavaScriptClick.on(MNU_APROBACION_CREDITO)
    );
  }
}
