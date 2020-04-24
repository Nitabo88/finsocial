package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Incorporacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IncorporacionPendiente implements Task {

  private static final int TIEMPO = 5;
  private final Incorporacion incorporacion;

  public IncorporacionPendiente(Incorporacion incorporacion) {
    this.incorporacion = incorporacion;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            Click.on(BTN_PENDIENTE_INCORPORACION.of(numeroCredito)),
            SelectFromOptions.byVisibleText(this.incorporacion.getTipoDevolucion()).from(LST_TIPO_DEVOLUCION),
            SelectFromOptions.byVisibleText(this.incorporacion.getMotivo()).from(LST_MOTIVO_DEVOLUCION),
            Enter.theValue(incorporacion.getRazonMotivo()).into(TXT_DETALLE),
            Click.on(BTN_REGISTRAR_PENDIENTE),
            WaitFor.seconds(3),
            WaitUntil.the(BTN_ACEPTAR, isVisible()).forNoMoreThan(IncorporacionPendiente.TIEMPO).seconds(),
            Click.on(BTN_ACEPTAR));
  }
}