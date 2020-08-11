package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.questions.ServicioDataPdf.laInformacionDelPdf;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.BTN_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.BTN_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.BTN_CONTINUAR_DATOS;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.CHK_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.LBL_MENSAJE_BIENVENIDA;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.LST_TIPO_DOCUMENTO;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.TXT_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.ValidacionPage.TXT_NUMERO_DOCUMENTO;
import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.Emails.OTP_BANCOMEVA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.interactions.Actualizar;
import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Validacion implements Task {

  private static final String TIPO_DOCUMENTO = "Cédula de ciudadanía";
  String sql;

  public Validacion(String sql) {
    this.sql = sql;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    LBL_MENSAJE_BIENVENIDA.resolveFor(actor).isPresent();
    String numeroCedula = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdBancomevaEnLinea(), sql, "DOCUMENTO"));
    actor.remember(CEDULA_ACTOR, numeroCedula);
    String informacionPdf= actor.asksFor(laInformacionDelPdf());
    actor.attemptsTo(
        Actualizar.informacionCliente(numeroCedula, OTP_BANCOMEVA.getEmail()),
        WaitFor.seconds(TIEMPO_3),
        SelectFromOptions.byVisibleText(TIPO_DOCUMENTO).from(LST_TIPO_DOCUMENTO),
        Enter.theValue(numeroCedula).into(TXT_NUMERO_DOCUMENTO),
        JavaScriptClick.on(CHK_TERMINOS_Y_CONDICIONES),
        Scroll.to(TXT_ACEPTO_TERMINOS_Y_CONDICIONES).andAlignToBottom(),
        JavaScriptClick.on(BTN_ACEPTO_TERMINOS_Y_CONDICIONES));
    actor.attemptsTo(
        WaitUntil.the(BTN_CONTINUAR, isVisible()).forNoMoreThan(TIEMPO_3).seconds(),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR),
        WaitFor.seconds(TIEMPO_3),
        WaitUntil.the(BTN_CONTINUAR_DATOS, isPresent()).forNoMoreThan(TIEMPO_3).seconds(),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR_DATOS));
  }
}
