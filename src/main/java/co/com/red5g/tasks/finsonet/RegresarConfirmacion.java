package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.LBL_CREDITO_REGRESADO;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.MNM_ACCION;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.TXT_MOTIVO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.models.finsonet.Confirmacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegresarConfirmacion implements Task {

  private static final int TIEMPO = 10;
  private final Confirmacion confirmacion;

  public RegresarConfirmacion(Confirmacion confirmacion) {
    this.confirmacion = confirmacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_CONFIRMACION.of(numeroCredito)),
        JavaScriptClick.on(MNM_ACCION.of(this.confirmacion.getAccion())),
        Enter.theValue(confirmacion.getRazonMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_OK),
        WaitUntil.the(LBL_CREDITO_REGRESADO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_OK));
  }
}