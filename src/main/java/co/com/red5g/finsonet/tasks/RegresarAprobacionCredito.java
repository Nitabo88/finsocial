package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.MNU_ACCION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.TXT_MOTIVO;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

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
        JavaScriptClick.on(MNU_ACCION.of(REGRESAR)),
        Enter.theValue(aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_OK),
        WaitFor.seconds(TIEMPO),
        JavaScriptClick.on(BTN_OK));
  }
}
