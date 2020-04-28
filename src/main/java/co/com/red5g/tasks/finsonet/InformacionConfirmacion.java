package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.MNM_ACCION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class InformacionConfirmacion implements Task {

  private static final String CONFIRMAR = "Confirmar";

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_CONFIRMACION.of(numeroCredito)),
        JavaScriptClick.on(MNM_ACCION.of(CONFIRMAR)),
        JavaScriptClick.on(BTN_OK));
  }
}