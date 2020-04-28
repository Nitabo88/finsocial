package co.com.red5g.tasks.finsonet;

import co.com.red5g.models.finsonet.Tesoreria;
import co.com.red5g.userinterfaces.finsonet.ReporteVentasPage;
import co.com.red5g.userinterfaces.finsonet.TesoreriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class PendienteTesoreria implements Task {

  private static final int TIEMPO = 150;
  private final Tesoreria tesoreria;

  public PendienteTesoreria(Tesoreria tesoreria) {
    this.tesoreria = tesoreria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            JavaScriptClick.on(TesoreriaPage.BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
            SelectFromOptions.byVisibleText(tesoreria.getMotivo()).from(TesoreriaPage.LST_MOTIVO),
            Enter.theValue(tesoreria.getDetalleMotivo()).into(TesoreriaPage.TXT_DETALLE),
            JavaScriptClick.on(TesoreriaPage.BTN_REGISTRAR_PENDIENTE),
            JavaScriptClick.on(TesoreriaPage.BTN_ACEPTAR),
            WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(100).seconds()
    );
  }
}
