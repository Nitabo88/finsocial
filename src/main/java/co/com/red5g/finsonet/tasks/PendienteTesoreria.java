package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_ACCION_TESORERIA;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_REGISTRAR_PENDIENTE;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.TXT_DETALLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.Tesoreria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PendienteTesoreria implements Task {

  private Tesoreria tesoreria;

  public PendienteTesoreria(Tesoreria tesoreria) {
    this.tesoreria = tesoreria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
        SelectFromOptions.byVisibleText(tesoreria.getMotivo()).from(LST_MOTIVO),
        Enter.theValue(tesoreria.getDetalleMotivo()).into(TXT_DETALLE),
        JavaScriptClick.on(BTN_REGISTRAR_PENDIENTE),
        JavaScriptClick.on(BTN_ACEPTAR),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(100).seconds()
    );
  }
}
