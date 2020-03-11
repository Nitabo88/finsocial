package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Tesoreria implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        AbreLaPagina.finsonet(),
        Click.on(LNK_ORIGINACION),
        Click.on(MNU_ORIGINACION.of("Tesore"))
    );
  }
}
