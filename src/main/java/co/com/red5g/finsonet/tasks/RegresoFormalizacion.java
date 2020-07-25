package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_ACCION_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_ACCION_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.TXT_MOTIVO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Formalizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegresoFormalizacion implements Task {

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
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_OK));
  }
}