package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_ACCION_TESORERIA;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_REGISTRAR_PENDIENTE;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.TXT_DETALLE;

import co.com.red5g.finsonet.models.Tesoreria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class PendienteTesoreria implements Task {

  private Tesoreria tesoreria;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = "88005";
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
        SelectFromOptions.byVisibleText(tesoreria.getMotivo()).from(LST_MOTIVO),
        Enter.theValue(tesoreria.getDetalleMotivo()).into(TXT_DETALLE),
        JavaScriptClick.on(BTN_REGISTRAR_PENDIENTE),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
