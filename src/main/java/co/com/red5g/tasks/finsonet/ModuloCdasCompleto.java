package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_CDAS;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Realiza;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ModuloCdasCompleto implements Task {

  private Credito credito;

  private static final int TIEMPO = 120;

  public ModuloCdasCompleto(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnFormalizacion(credito),
        Diligencia.laAprobacionDelCreditoEnFormalizacion(),
        Realiza.laLlamada(),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(IMG_FINSONET),
        WaitFor.seconds(3),
        MoveMouse.to(LNK_CDAS),
        Click.on(LNK_CDAS));
  }
}
