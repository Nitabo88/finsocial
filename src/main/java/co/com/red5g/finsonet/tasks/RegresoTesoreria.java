package co.com.red5g.finsonet.tasks;


import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.Tesoreria;
import co.com.red5g.finsonet.userinterfaces.ReporteVentasPage;
import co.com.red5g.finsonet.userinterfaces.TesoreriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegresoTesoreria implements Task {

  private final Tesoreria tesoreria;

  public RegresoTesoreria(Tesoreria tesoreria) {
    this.tesoreria = tesoreria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        MoveMouse.to(TesoreriaPage.BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
        JavaScriptClick.on(TesoreriaPage.BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
        SelectFromOptions.byVisibleText(tesoreria.getSolicitadoPor()).from(TesoreriaPage.LST_SOLICITADO_POR),
        Enter.theValue(tesoreria.getMotivo()).into(TesoreriaPage.TXT_MOTIVO),
        JavaScriptClick.on(TesoreriaPage.BTN_REGISTRAR),
        JavaScriptClick.on(TesoreriaPage.BTN_ACEPTAR),
        WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds());
  }
}
