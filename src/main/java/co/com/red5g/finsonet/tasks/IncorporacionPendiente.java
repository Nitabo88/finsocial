package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_PENDIENTE_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGISTRAR_PENDIENTE;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_MOTIVO_DEVOLUCION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_TIPO_DEVOLUCION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.TXT_DETALLE;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Incorporacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class IncorporacionPendiente implements Task {

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
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_ACEPTAR));
  }
}