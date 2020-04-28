package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegresarIncoporacion implements Task {

  private static final int TIEMPO = 20;
  private final Incorporacion incorporacion;

  public RegresarIncoporacion(Incorporacion incorporacion) {
    this.incorporacion = incorporacion;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            JavaScriptClick.on(BTN_REGRESAR_INCORPORACION.of(numeroCredito)),
            SelectFromOptions.byVisibleText(this.incorporacion.getSolicitadoPor()).from(LST_SOLICITADO_POR),
            Enter.theValue(incorporacion.getRazonMotivo()).into(TXT_MOTIVO),
            JavaScriptClick.on(BTN_REGISTRAR_REGRESAR),
            WaitFor.seconds(3),
            WaitUntil.the(BTN_ACEPTAR, isVisible()).forNoMoreThan(RegresarIncoporacion.TIEMPO).seconds(),
            JavaScriptClick.on(BTN_ACEPTAR),
            Ingresa.enAprobacion());
  }
}
