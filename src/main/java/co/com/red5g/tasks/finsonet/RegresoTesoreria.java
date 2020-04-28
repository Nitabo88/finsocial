package co.com.red5g.tasks.finsonet;


import co.com.red5g.models.finsonet.Tesoreria;
import co.com.red5g.userinterfaces.finsonet.ReporteVentasPage;
import co.com.red5g.userinterfaces.finsonet.TesoreriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
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
            WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            MoveMouse.to(TesoreriaPage.BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
            JavaScriptClick.on(TesoreriaPage.BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
            SelectFromOptions.byVisibleText(tesoreria.getSolicitadoPor()).from(TesoreriaPage.LST_SOLICITADO_POR),
            Enter.theValue(tesoreria.getMotivo()).into(TesoreriaPage.TXT_MOTIVO),
            JavaScriptClick.on(TesoreriaPage.BTN_REGISTRAR),
            JavaScriptClick.on(TesoreriaPage.BTN_ACEPTAR),
            WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
  }
}
