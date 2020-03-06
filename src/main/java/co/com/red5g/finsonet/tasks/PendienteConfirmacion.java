package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.LST_MOTIVO_PENDIENTE;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.MNU_ACCION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.TXT_MOTIVO_PENDIENTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Confirmacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PendienteConfirmacion implements Task {

  private static final int TIEMPO = 10;
  private final Confirmacion confirmacion;

  public PendienteConfirmacion(Confirmacion confirmacion) {
    this.confirmacion = confirmacion;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_CONFIRMACION.of(numeroCredito)),
        JavaScriptClick.on(MNU_ACCION.of(this.confirmacion.getAccion())),
        SelectFromOptions.byVisibleText(this.confirmacion.getMotivo()).from(LST_MOTIVO_PENDIENTE),
        Enter.theValue(this.confirmacion.getRazonMotivo()).into(TXT_MOTIVO_PENDIENTE),
        Click.on(BTN_ACEPTAR),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(BTN_OK));
  }
}
