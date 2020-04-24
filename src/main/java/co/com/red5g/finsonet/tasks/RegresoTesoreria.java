package co.com.red5g.finsonet.tasks;


import co.com.red5g.finsonet.models.Tesoreria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class RegresoTesoreria implements Task {

  private static final int TIEMPO = 120;
  private final Tesoreria tesoreria;

  public RegresoTesoreria(Tesoreria tesoreria) {
    this.tesoreria = tesoreria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            MoveMouse.to(BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
            JavaScriptClick.on(BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
            SelectFromOptions.byVisibleText(tesoreria.getSolicitadoPor()).from(LST_SOLICITADO_POR),
            Enter.theValue(tesoreria.getMotivo()).into(TXT_MOTIVO),
            JavaScriptClick.on(BTN_REGISTRAR),
            JavaScriptClick.on(BTN_ACEPTAR),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
  }
}
