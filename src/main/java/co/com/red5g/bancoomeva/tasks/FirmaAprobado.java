package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.CodigoRecuperacion.obtenerCodigoDeRecuperacion;
import static co.com.red5g.bancoomeva.tasks.CodigoVerificacionFirma.obtenerCodigoVerificacionFirma;
import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.LNK_CODIGO_RECUPERACION;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.SPN_CARGANDO;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.SPN_CARGA_LOGO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTAR_Y_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_REGRESAR_INICIO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.CHK_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_MENSAJE_FELICITACIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO_RECUPERACION;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
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

public class FirmaAprobado implements Task {

  BancoomevaHomePage bancoomevaHomePage;
  private static final String MENSAJE_FELICITACIONES = "¡Felicitaciones!";


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(obtenerCodigoDeRecuperacion());
    String codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        cerrarPestana(),
        Open.browserOn(bancoomevaHomePage),
        JavaScriptClick.on(LNK_CODIGO_RECUPERACION),
        Enter.theValue(codigo).into(TXT_CODIGO_RECUPERACION),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(CHK_TERMINOS_Y_CONDICIONES),
        Scroll.to(LBL_TERMINOS_Y_CONDICIONES),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Click.on(BTN_ACEPTO_TERMINOS_Y_CONDICIONES),
        WaitFor.seconds(TIEMPO_3),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        JavaScriptClick.on(BTN_CONTINUAR),
        WaitUntil.the(SPN_CARGA_LOGO, isNotVisible()).forNoMoreThan(TIEMPO_120).seconds(),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR),
        obtenerCodigoVerificacionFirma()
    );
    codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        Enter.theValue(codigo).into(TXT_CODIGO),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR),
        WaitUntil.the(SPN_CARGA_LOGO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds(),
        Ensure.that(LBL_MENSAJE_FELICITACIONES.resolveFor(actor).getText()).contains(MENSAJE_FELICITACIONES),
        JavaScriptClick.on(BTN_REGRESAR_INICIO)
    );
  }
}
