package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_CREDITO_CREADO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_NOMBRE_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_PAGADURIA;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_PERFIL_RIESGO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.TXT_CENTRO_COSTO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class AprobacionDeCreditoFinsoamigo implements Task {

  private final String perfilRiesgo;
  private static final String PAGADURIA = "COLPENSIONES";
  private static final String CENTRO_COSTO = "I.E. Tec. Agrop. Campeche Baranoa";

  public AprobacionDeCreditoFinsoamigo(String perfilRiesgo) {
    this.perfilRiesgo = perfilRiesgo;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(LBL_NOMBRE_FINSOAMIGO.of(numeroCredito)),
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Enter.theValue(CENTRO_COSTO).into(TXT_CENTRO_COSTO).thenHit(Keys.TAB),
        WaitFor.seconds(TIEMPO_3),
        SelectFromOptions.byValue(PAGADURIA).from(LST_PAGADURIA),
        WaitFor.seconds(TIEMPO_3));
    actor.attemptsTo(
        SelectFromOptions.byValue(perfilRiesgo).from(LST_PERFIL_RIESGO));
    actor.attemptsTo(
        WaitUntil.the(BTN_APROBAR, isPresent()).forNoMoreThan(TIEMPO_60).seconds(),
        WaitFor.seconds(TIEMPO_3),
        Scroll.to(BTN_APROBAR).andAlignToBottom(),
        Click.on(BTN_APROBAR),
        WaitFor.seconds(TIEMPO_3),
        WaitUntil.the(LBL_CREDITO_CREADO, isPresent()).forNoMoreThan(TIEMPO_60).seconds(),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_OK)
    );
  }
}
