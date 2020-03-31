package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_CDAS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Realiza;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ModuloCdasCompleto implements Task {

  private static final int TIEMPO = 120;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnFormalizacion(),
        Diligencia.laAprobacionDelCreditoEnFormalizacion(),
        Realiza.laLlamada(),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(IMG_FINSONET),
        WaitUntil.the(LNK_CDAS, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LNK_CDAS));
  }
}
