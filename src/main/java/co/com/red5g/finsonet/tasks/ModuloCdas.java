package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.IncorporacionBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_CDAS;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class ModuloCdas implements Task {

  private Credito credito;

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
        WaitFor.seconds(TIEMPO_3),
        MoveMouse.to(LNK_CDAS),
        Click.on(LNK_CDAS)
    );
  }
}