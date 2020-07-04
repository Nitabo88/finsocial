package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_ACCION_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_ACCION_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_MOTIVO_PENDIENTE;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.TXT_DETALLE_PENDIENTE;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Formalizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PendienteFormalizacion implements Task {

  private final Formalizacion formalizacion;

  public PendienteFormalizacion(final Formalizacion formalizacion) {
    this.formalizacion = formalizacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_FORMALIZACION.of(numeroCredito)),
        JavaScriptClick.on(LST_ACCION_FORMALIZACION.of(numeroCredito, formalizacion.getAccion())),
        SelectFromOptions.byVisibleText(formalizacion.getMotivo()).from(LST_MOTIVO_PENDIENTE),
        Enter.theValue(formalizacion.getDetalleMotivo()).into(TXT_DETALLE_PENDIENTE),
        WaitUntil.the(BTN_ENVIAR, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        Click.on(BTN_ENVIAR),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_OK)
    );
  }
}