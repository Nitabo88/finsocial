package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.questions.ValorMinimo.elValorMinimo;
import static co.com.red5g.bancoomeva.tasks.GuardarSimulacion.guardaValoresSimulacion;
import static co.com.red5g.bancoomeva.userinterfaces.BancoomevaHomePage.SPN_CARGANDO;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_ACEPTAR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_ACEPTAR_Y_CONTINUAR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_AGREGAR_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_COLABORADOR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_GUARDAR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.BTN_SALIR;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_MODAL_INSUFICIENTE;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LST_PLAZO_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.TXT_MONTO_CREDITO_LIBRANZA;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Simulacion implements Task {

  String plazo = "1";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(JavaScriptClick.on(BTN_AGREGAR_LIBRANZA));
    actor.attemptsTo(
        Enter.theValue("1").into(TXT_MONTO_CREDITO_LIBRANZA).thenHit(Keys.TAB),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds());
    String valorMinimo = actor.asksFor(elValorMinimo(LBL_MODAL_INSUFICIENTE));
    actor.attemptsTo(
        Click.on(BTN_ACEPTAR),
        WaitFor.seconds(TIEMPO_3),
        Enter.theValue(valorMinimo).into(TXT_MONTO_CREDITO_LIBRANZA).thenHit(Keys.TAB),
        SelectFromOptions.byVisibleText(plazo).from(LST_PLAZO_LIBRANZA),
        WaitFor.seconds(TIEMPO_3),
        guardaValoresSimulacion(),
        JavaScriptClick.on(BTN_GUARDAR),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_ACEPTAR_Y_CONTINUAR),
        Diligencia.laInformacionDelSeguroDeVida(),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(SeguroVidaPage.BTN_ACEPTAR_Y_CONTINUAR),
        Click.on(BTN_COLABORADOR),
        Click.on(BTN_SALIR)
    );
  }
}
