package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_PENDIENTE_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_MOTIVO_DEVOLUCION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_TIPO_DEVOLUCION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.TXT_DETALLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Incorporacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IncorporacionPendiente implements Task {

  private static final int TIEMPO = 5;
  private Incorporacion incorporacion;

  public IncorporacionPendiente(final Incorporacion incorporacion) {
    this.incorporacion = incorporacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_PENDIENTE_INCORPORACION.of(numeroCredito)),
        SelectFromOptions.byVisibleText(incorporacion.getTipoDevolucion()).from(LST_TIPO_DEVOLUCION),
        SelectFromOptions.byVisibleText(incorporacion.getMotivo()).from(LST_MOTIVO_DEVOLUCION),
        Enter.theValue(this.incorporacion.getRazonMotivo()).into(TXT_DETALLE),
        JavaScriptClick.on(BTN_REGISTRAR),
        WaitUntil.the(BTN_ACEPTAR, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ACEPTAR));
  }
}