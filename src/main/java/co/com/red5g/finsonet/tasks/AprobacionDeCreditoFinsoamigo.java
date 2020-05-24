package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AprobacionDeCreditoFinsoamigo implements Task {

  private String perfilRiesgo;

  private static final int TIEMPO = 10;

  public AprobacionDeCreditoFinsoamigo(String perfilRiesgo) {
    this.perfilRiesgo = perfilRiesgo;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
            JavaScriptClick.on(LBL_NOMBRE_FINSOAMIGO.of(numeroCredito)),
            WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            SelectFromOptions.byVisibleText(perfilRiesgo).from(LST_PERFIL_RIESGO),
            MoveMouse.to(BTN_APROBAR),
            JavaScriptClick.on(BTN_APROBAR),
            WaitUntil.the(BTN_OK, isVisible()),
            JavaScriptClick.on(BTN_OK)
    );
  }
}
