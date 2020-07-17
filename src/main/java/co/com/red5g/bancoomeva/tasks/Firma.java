package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.LNK_CODIGO_RECUPERACION;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_ACEPTO_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.BTN_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.CHK_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LBL_TERMINOS_Y_CONDICIONES;
import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.TXT_CODIGO_RECUPERACION;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

public class Firma implements Task {

  BancoomevaHomePage bancoomevaHomePage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String codigo = actor.recall(CODIGO);
    actor.attemptsTo(
        Open.browserOn(bancoomevaHomePage),
        JavaScriptClick.on(LNK_CODIGO_RECUPERACION),
        Enter.theValue(codigo).into(TXT_CODIGO_RECUPERACION),
        JavaScriptClick.on(CHK_TERMINOS_Y_CONDICIONES),
        Scroll.to(LBL_TERMINOS_Y_CONDICIONES),
        Click.on(BTN_ACEPTO_TERMINOS_Y_CONDICIONES),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_CONTINUAR)
    );
    actor.attemptsTo(
        JavaScriptClick.on(BTN_CONTINUAR)
    );
  }
}
