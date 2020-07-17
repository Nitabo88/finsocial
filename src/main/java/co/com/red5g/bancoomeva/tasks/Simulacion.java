package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.questions.ValorMinimo.elValorMinimo;
import static co.com.red5g.bancoomeva.tasks.LoginGmail.ingresarEnGmail;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_ACEPTAR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_ACEPTAR_Y_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_AGREGAR_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_GUARDAR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_MODAL_INSUFICIENTE;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_TASA_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LST_PLAZO_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.TXT_MONTO_CREDITO_LIBRANZA;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.Emails.OTP_BANCOMEVA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.interactions.OpenNewTab;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Simulacion implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(JavaScriptClick.on(BTN_AGREGAR_LIBRANZA));
    actor.attemptsTo(
        Enter.theValue("1").into(TXT_MONTO_CREDITO_LIBRANZA).thenHit(Keys.TAB));
    String valorMinimo = actor.asksFor(elValorMinimo(LBL_MODAL_INSUFICIENTE));
    String tasa = LBL_TASA_LIBRANZA.resolveFor(actor).getValue();
    actor.attemptsTo(
        Click.on(BTN_ACEPTAR),
        Enter.theValue(valorMinimo).into(TXT_MONTO_CREDITO_LIBRANZA).thenHit(Keys.TAB),
        SelectFromOptions.byVisibleText("1").from(LST_PLAZO_LIBRANZA),
        WaitUntil.the(BTN_GUARDAR, isClickable()).forNoMoreThan(TIEMPO_3).seconds(),
        Click.on(BTN_GUARDAR));
    actor.attemptsTo(
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR),
        Diligencia.laInformacionDelSeguroDeVida());
    actor.attemptsTo(
        MoveMouse.to(SeguroVidaPage.BTN_ACEPTAR_Y_CONTINUAR),
        Click.on(SeguroVidaPage.BTN_ACEPTAR_Y_CONTINUAR)
    );
    actor.attemptsTo(
        ingresarEnGmail(OTP_BANCOMEVA)
    );
  }
}
