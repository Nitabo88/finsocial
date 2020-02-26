package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_ACTUALIZAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGISTRAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_INCORPORACION_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_SELECCIONAR_GESTION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.TXT_ARCHIVO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.TXT_DETALLE_GESTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AprobacionIncorporacion implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    final String numeroCredito = "84929";
    actor.attemptsTo(
        JavaScriptClick.on(LST_INCORPORACION_NOMBRE.of(numeroCredito)),
        JavaScriptClick.on(BTN_ACTUALIZAR_GESTION));
    actor.attemptsTo(
        SelectFromOptions.byVisibleText("Incorporado").from(LST_SELECCIONAR_GESTION)
    );
    actor.attemptsTo(
        Enter.theValue("prueba").into(TXT_DETALLE_GESTION));
    actor.attemptsTo(
        Enter.theValue("C:\\Users\\Licet\\Documents\\sqa_code\\src\\test\\resources\\files").into(TXT_ARCHIVO));
    actor.attemptsTo(
        JavaScriptClick.on(BTN_REGISTRAR),
        JavaScriptClick.on(BTN_APROBAR),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
