package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.MNM_ACCION;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

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