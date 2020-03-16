package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Tesoreria implements Task {

  private static final String TESORERIA = "Tesorería";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnFormalizacion(),
        Diligencia.laAprobacionDelCreditoEnFormalizacion(),
        Click.on(MNU_ORIGINACION.of(TESORERIA)),
        WaitUntil.the(SPN_CARGANDO,isNotVisible()).forNoMoreThan(100).seconds()
    );
  }
}