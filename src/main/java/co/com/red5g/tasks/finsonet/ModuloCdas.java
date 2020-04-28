package co.com.red5g.tasks.finsonet;

import static co.com.red5g.models.builders.finsonet.IncorporacionBuilder.con;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_CDAS;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_HAMBURGUESA;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class ModuloCdas implements Task {

  private Credito credito;
  private static final int TIEMPO = 3;

  public ModuloCdas(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnIncorporacion(credito),
        Diligencia.laAprobacionDelCreditoEnIncorporacion(con().aprobacion()),
        Click.on(MNM_HAMBURGUESA),
        Click.on(IMG_FINSONET),
        WaitFor.seconds(TIEMPO),
        MoveMouse.to(LNK_CDAS),
        Click.on(LNK_CDAS)
    );
  }
}