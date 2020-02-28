package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Incorporacion implements Task {

  private static final String INCORPORACION = "Incorporación";

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditos(),
        Diligencia.laInformacionDeAprobacionDeCredito(),
        Click.on(MNU_ORIGINACION.of(Incorporacion.INCORPORACION))
    );
  }
}