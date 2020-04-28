package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.BTN_ACCION_FORMALIZACION;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.BTN_ENVIAR;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.LST_ACCION_FORMALIZACION;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.LST_MOTIVO_PENDIENTE;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.TXT_DETALLE_PENDIENTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.models.finsonet.Formalizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PendienteFormalizacion implements Task {

  private static final int TIEMPO = 20;
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
        WaitUntil.the(BTN_ENVIAR, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(BTN_ENVIAR),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(BTN_OK)
    );
    actor.attemptsTo(
        Check.whether(BTN_ENVIAR.resolveFor(actor).isPresent()).andIfSo(
            Click.on(BTN_ENVIAR),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_OK)
        )
    );
  }
}