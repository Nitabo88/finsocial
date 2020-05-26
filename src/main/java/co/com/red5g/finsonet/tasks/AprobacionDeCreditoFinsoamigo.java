package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AprobacionDeCreditoFinsoamigo implements Task {

  private String perfilRiesgo;
  private static final String PAGADURIA = "FINSOCIAL";
  private static final String CENTRO_COSTO = "I.E. Tec. Agrop. Campeche Baranoa";

  private static final int TIEMPO = 100;

  public AprobacionDeCreditoFinsoamigo(String perfilRiesgo) {
    this.perfilRiesgo = perfilRiesgo;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            JavaScriptClick.on(LBL_NOMBRE_FINSOAMIGO.of(numeroCredito)),
            WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Enter.theValue(CENTRO_COSTO).into(TXT_CENTRO_COSTO),
            SelectFromOptions.byValue(PAGADURIA).from(LST_PAGADURIA),
            SelectFromOptions.byVisibleText(perfilRiesgo).from(LST_PERFIL_RIESGO),
            WaitFor.seconds(3));
    actor.attemptsTo(
            MoveMouse.to(BTN_APROBAR),
            Click.on(BTN_APROBAR),
            WaitFor.seconds(3),
            WaitUntil.the(LBL_CREDITO_CREADO, isPresent()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_OK)
    );
  }
}
