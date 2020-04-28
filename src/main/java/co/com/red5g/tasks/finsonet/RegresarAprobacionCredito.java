package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.MNM_ACCION;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.TXT_MOTIVO;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;

public class RegresarAprobacionCredito implements Task {

  private static final int TIEMPO = 5;
  private final AprobacionCredito aprobacionCredito;

  private static final String REGRESAR = "Regresar";

  public RegresarAprobacionCredito(AprobacionCredito aprobacionCredito) {
    this.aprobacionCredito = aprobacionCredito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_CONFIRMACION.of(numeroCredito)),
        JavaScriptClick.on(MNM_ACCION.of(REGRESAR)),
        Enter.theValue(aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO),
        Click.on(BTN_OK),
        WaitFor.seconds(TIEMPO),
        Click.on(BTN_OK));
    actor.attemptsTo(
        Check.whether(BTN_OK.resolveFor(actor).isVisible())
            .andIfSo(
                Click.on(BTN_OK),
                WaitFor.seconds(TIEMPO),
                Click.on(BTN_OK)));
  }
}
