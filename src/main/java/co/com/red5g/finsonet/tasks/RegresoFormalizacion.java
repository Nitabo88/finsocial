package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_ACCION_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LST_ACCION_FORMALIZACION;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.TXT_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.LST_SOLICITADO_POR;

import co.com.red5g.finsonet.models.Formalizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegresoFormalizacion implements Task {

  private Formalizacion formalizacion;

  public RegresoFormalizacion(final Formalizacion formalizacion) {
    this.formalizacion = formalizacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_ACCION_FORMALIZACION.of(numeroCredito)),
        JavaScriptClick.on(LST_ACCION_FORMALIZACION.of(numeroCredito, formalizacion.getAccion())),
        SelectFromOptions.byVisibleText(formalizacion.getAccion()).from(LST_SOLICITADO_POR),
        Enter.theValue(this.formalizacion.getMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_OK),
        JavaScriptClick.on(BTN_OK));
  }
}