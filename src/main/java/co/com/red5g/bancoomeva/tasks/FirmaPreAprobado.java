package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.questions.NumeroGestionCredito.numeroGestion;
import static co.com.red5g.bancoomeva.tasks.CodigoRecuperacion.obtenerCodigoDeRecuperacion;
import static co.com.red5g.bancoomeva.tasks.CodigoVerificacionFirma.obtenerCodigoVerificacionFirma;
import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.LNK_CODIGO_RECUPERACION;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.SPN_CARGA_LOGO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTAR_Y_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTAR_Y_CONTINUAR_DOCUMENTOS;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_REGRESAR_INICIO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.CHK_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_MENSAJE;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO_RECUPERACION;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
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
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FirmaPreAprobado implements Task {

  private static final String MENSAJE_PRE_APROBADO = "Estás muy cerca de obtener tus productos";
  BancoomevaHomePage bancoomevaHomePage;
  public static final String ID_GESTION = "Id de Gestion";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(obtenerCodigoDeRecuperacion());
    actor.remember(ID_GESTION, actor.asksFor(numeroGestion()));
    String codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        cerrarPestana(),
        Open.browserOn(bancoomevaHomePage),
        JavaScriptClick.on(LNK_CODIGO_RECUPERACION),
        Enter.theValue(codigo).into(TXT_CODIGO_RECUPERACION),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(CHK_TERMINOS_Y_CONDICIONES),
        Scroll.to(LBL_TERMINOS_Y_CONDICIONES),
        Click.on(BTN_ACEPTO_TERMINOS_Y_CONDICIONES),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR),
        WaitFor.seconds(TIEMPO_3),
        Subir.documentosCallCenter(),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR_DOCUMENTOS),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR),
        obtenerCodigoVerificacionFirma()
    );
    codigo(actor, TIEMPO_300, MENSAJE_PRE_APROBADO);
  }

  static <T extends Actor> void codigo(T actor, int tiempo300, String mensajePreAprobado) {
    String codigo;
    codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        Enter.theValue(codigo).into(TXT_CODIGO),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR),
        WaitUntil.the(SPN_CARGA_LOGO, isNotVisible()).forNoMoreThan(tiempo300).seconds());
    actor.attemptsTo(
        Scroll.to(LBL_MENSAJE).andAlignToBottom(),
        Ensure.that(LBL_MENSAJE.resolveFor(actor).getText()).contains(mensajePreAprobado),
        JavaScriptClick.on(BTN_REGRESAR_INICIO)
    );
  }
}
