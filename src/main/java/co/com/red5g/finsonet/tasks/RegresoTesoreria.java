package co.com.red5g.finsonet.tasks;


import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_ACCION_TESORERIA;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_SOLICITADO_POR;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.TXT_MOTIVO;

import co.com.red5g.finsonet.models.Tesoreria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegresoTesoreria implements Task {

  private Tesoreria tesoreria;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = "87882";
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
        SelectFromOptions.byVisibleText(tesoreria.getSolicitadoPor()).from(LST_SOLICITADO_POR),
        Enter.theValue(tesoreria.getMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_REGISTRAR),
        JavaScriptClick.on(BTN_OK));
  }
}
