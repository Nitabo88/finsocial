package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LBL_NOMBRE_TESORERIA_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_TIPO_GIRO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_TIPO_PAGO;
import static co.com.red5g.utils.NumeroCreditoFinsoamigo.TESORERIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AprobacionTesoreriaFinsoamigo implements Task {
  private static final int TIEMPO = 200;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
    String numeroCredito = TESORERIA.getNumeroCredito();
    actor.remember(NUMERO_CREDITO, numeroCredito);
    actor.attemptsTo(Click.on(LBL_NOMBRE_TESORERIA_FINSOAMIGO.of(numeroCredito)),
        cambiarPestanaActual(),
        SelectFromOptions.byVisibleText("GIRO").from(LST_TIPO_GIRO),
        SelectFromOptions.byVisibleText("GIRO").from(LST_TIPO_PAGO),


        );
  }
}
