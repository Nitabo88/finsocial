package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

public class Incorporacion implements Task {

  private static final String INCORPORACION = "Incorporación";


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditos(),
        Click.on(MNU_ORIGINACION.of(INCORPORACION))
    );
  }
}
