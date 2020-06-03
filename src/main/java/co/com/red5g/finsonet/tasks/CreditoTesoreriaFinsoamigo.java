package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_FINSOAMIGO1;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_NOMBRE_TESORERIA_FINSOAMIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CreditoTesoreriaFinsoamigo implements Task {

  private static final String TESORERIA = "Tesorería";

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito=
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        Click.on(LNK_ORIGINACION),
        Click.on(MNM_ORIGINACION.of(TESORERIA)),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());

    String numeroCredito = LST_FILA_TESORERIA_FINSOAMIGO1.resolveFor(actor).getText();
    actor.attemptsTo(Click.on(LST_NOMBRE_TESORERIA_FINSOAMIGO.of(numeroCredito)));

  }
}
