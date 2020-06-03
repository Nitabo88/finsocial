package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestanaAnterior.cerrarPestanaAnterior;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_NOMBRE_TESORERIA_FINSOAMIGO;
import static co.com.red5g.utils.data.NumeroCreditoFinsoamigo.NUMERO_CREDITO_FINSOAMIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CreditoTesoreriaFinsoamigo implements Task {

  private static final String TESORERIA = "Tesorería";
  private static final int TIEMPO = 180;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = NUMERO_CREDITO_FINSOAMIGO.getNumeroCredito();
    actor.attemptsTo(
        Loguearse.enFinsonet(),
        WaitFor.seconds(3),
        Click.on(LNK_ORIGINACION),
        Click.on(MNM_ORIGINACION.of(TESORERIA)),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(LST_NOMBRE_TESORERIA_FINSOAMIGO.of(numeroCredito)),
        cambiarPestanaActual());
  }
}
