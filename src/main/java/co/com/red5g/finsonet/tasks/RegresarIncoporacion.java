package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGRESAR_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_SOLICITADO_POR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.TXT_MOTIVO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegresarIncoporacion implements Task {

  private static final int TIEMPO = 10;
  private Incorporacion incorporacion;

  @Override
  public <T extends Actor> void performAs(T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_REGRESAR_INCORPORACION.of(numeroCredito)));
    actor.attemptsTo(
        SelectFromOptions.byVisibleText(incorporacion.getSolicitadoPor()).from(LST_SOLICITADO_POR)
    );
    actor.attemptsTo(
        Enter.theValue(this.incorporacion.getRazonMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_REGISTRAR),
        WaitUntil.the(BTN_ACEPTAR, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ACEPTAR),
        Ingresa.enAprobacion());
  }
}
