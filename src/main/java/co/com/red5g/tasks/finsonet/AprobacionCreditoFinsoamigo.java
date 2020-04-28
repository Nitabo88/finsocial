package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.tasks.factories.finsonet.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AprobacionCreditoFinsoamigo implements Task {

  private static final String APROBACION_CREDITO = "Apr. de créditos";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        WaitFor.seconds(3),
        Click.on(LNK_ORIGINACION),
        Click.on(MNM_ORIGINACION.of(APROBACION_CREDITO))
    );
  }
}
