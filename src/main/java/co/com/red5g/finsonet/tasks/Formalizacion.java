package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.IncorporacionBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_NUEVO_ORIGINACION;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Formalizacion implements Task {

  private static final String FORMALIZACION = "Formalización";

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnIncorporacion(),
        Diligencia.laAprobacionDelCreditoEnIncorporacion(con().aprobacion()),
        Click.on(MNU_HAMBURGUESA),
        Click.on(MNU_NUEVO_ORIGINACION.of(FORMALIZACION)));
  }
}
