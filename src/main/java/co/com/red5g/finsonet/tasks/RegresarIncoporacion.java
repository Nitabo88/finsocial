package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGISTRAR_REGRESAR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.BTN_REGRESAR_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_SOLICITADO_POR;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.TXT_MOTIVO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegresarIncoporacion implements Task {

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
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR),
        Ingresa.enAprobacion());
  }
}
