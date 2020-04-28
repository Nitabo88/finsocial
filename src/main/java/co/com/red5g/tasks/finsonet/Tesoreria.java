package co.com.red5g.tasks.finsonet;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Tesoreria implements Task {

  private static final String MNM_TESORERIA = "Tesorería";
  private static final int TIEMPO = 150;
  private Credito credito;

  public Tesoreria(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnFormalizacion(credito),
        Diligencia.laAprobacionDelCreditoEnFormalizacion(),
        Click.on(MNM_ORIGINACION.of(MNM_TESORERIA)),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds()
    );
  }
}