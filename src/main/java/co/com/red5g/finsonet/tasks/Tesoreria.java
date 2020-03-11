package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Tesoreria implements Task {

  private static final String TESORERIA = "Tesorería";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnFormalizacion(),
        Diligencia.laAprobacionDelCreditoEnFormalizacion(),
        Click.on(MNU_ORIGINACION.of(TESORERIA))
    );
  }
}