package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.MNU_ACCION;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.TXT_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionCreditoPendiente implements Task {

  private static final int TIEMPO = 20;
  private final AprobacionCredito aprobacionCredito;
  private static final String PENDIENTE = "Pendiente";

  public AprobacionCreditoPendiente(final AprobacionCredito aprobacionCredito) {
    this.aprobacionCredito = aprobacionCredito;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_CONFIRMACION.of(numeroCredito)),
        JavaScriptClick.on(MNU_ACCION.of(AprobacionCreditoPendiente.PENDIENTE)),
        SelectFromOptions.byVisibleText(this.aprobacionCredito.getSeleccionMotivo()).from(LST_MOTIVO),
        Enter.theValue(this.aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_ENVIAR),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(AprobacionCreditoPendiente.TIEMPO).seconds(),
        JavaScriptClick.on(BTN_OK));
  }
}
