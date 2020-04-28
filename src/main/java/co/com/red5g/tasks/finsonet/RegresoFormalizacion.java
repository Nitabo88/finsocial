package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.BTN_ACCION_FORMALIZACION;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.LST_ACCION_FORMALIZACION;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.TXT_MOTIVO;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.Formalizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class RegresoFormalizacion implements Task {

  private static final int TIEMPO = 5;
  private final Formalizacion formalizacion;

  public RegresoFormalizacion(Formalizacion formalizacion) {
    this.formalizacion = formalizacion;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_FORMALIZACION.of(numeroCredito)),
        JavaScriptClick.on(LST_ACCION_FORMALIZACION.of(numeroCredito, this.formalizacion.getAccion())),
        Enter.theValue(formalizacion.getMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_OK),
        WaitFor.seconds(TIEMPO),
        JavaScriptClick.on(BTN_OK));
  }
}