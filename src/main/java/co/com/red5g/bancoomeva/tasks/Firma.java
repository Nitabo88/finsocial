package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.CODIGO;
import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.buscarCorreo;
import static co.com.red5g.bancoomeva.tasks.LoginGmail.ingresarEnGmail;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.LNK_CODIGO_RECUPERACION;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.SPN_CARGA;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTAR_Y_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTAR_Y_CONTINUAR_DOCUMENTOS;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_REGRESAR_INICIO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.CHK_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO_RECUPERACION;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.Emails.OTP_BANCOMEVA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.interactions.factories.Subir;
import co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Firma implements Task {

  BancoomevaHomePage bancoomevaHomePage;
  private static final String BUSQUEDA_CODIGO_FIRMA = "bancoomeva_en_linea@coomeva.com.co";
  private static final String BUSQUEDA_NOTIFICACION_SMS = "notificaciones_sms@coomeva.com.co";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ingresarEnGmail(OTP_BANCOMEVA),
        buscarCorreo(BUSQUEDA_CODIGO_FIRMA),
        cerrarPestana()
        );
    String codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        Open.browserOn(bancoomevaHomePage),
        JavaScriptClick.on(LNK_CODIGO_RECUPERACION),
        Enter.theValue(codigo).into(TXT_CODIGO_RECUPERACION),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(CHK_TERMINOS_Y_CONDICIONES),
        Scroll.to(LBL_TERMINOS_Y_CONDICIONES),
        Click.on(BTN_ACEPTO_TERMINOS_Y_CONDICIONES),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR),
        Subir.documentosCallCenter(),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR_DOCUMENTOS),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR)
    );
    actor.attemptsTo(
        ingresarEnGmail(OTP_BANCOMEVA),
        buscarCorreo(BUSQUEDA_NOTIFICACION_SMS),
        cerrarPestana());
    codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        Enter.theValue(codigo).into(TXT_CODIGO),
        WaitUntil.the(SPN_CARGA, isNotVisible()).forNoMoreThan(TIEMPO_120).seconds(),
        JavaScriptClick.on(BTN_CONTINUAR),
        JavaScriptClick.on(BTN_REGRESAR_INICIO)
    );
  }
}
