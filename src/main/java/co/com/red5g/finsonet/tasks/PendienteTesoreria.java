package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.utils.data.Constantes.TIEMPO_3;
import static co.com.red5g.utils.data.Constantes.TIEMPO_300;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Tesoreria;
import co.com.red5g.finsonet.userinterfaces.ReporteVentasPage;
import co.com.red5g.finsonet.userinterfaces.TesoreriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PendienteTesoreria implements Task {

  private final Tesoreria tesoreria;

  public PendienteTesoreria(Tesoreria tesoreria) {
    this.tesoreria = tesoreria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds(),
            JavaScriptClick.on(TesoreriaPage.BTN_ACCION_TESORERIA.of(numeroCredito, tesoreria.getAccion())),
            SelectFromOptions.byVisibleText(tesoreria.getMotivo()).from(TesoreriaPage.LST_MOTIVO),
            Enter.theValue(tesoreria.getDetalleMotivo()).into(TesoreriaPage.TXT_DETALLE),
            JavaScriptClick.on(TesoreriaPage.BTN_REGISTRAR_PENDIENTE),
            WaitFor.seconds(TIEMPO_3),
            JavaScriptClick.on(TesoreriaPage.BTN_ACEPTAR),
            WaitUntil.the(ReporteVentasPage.SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds()
    );
  }
}
