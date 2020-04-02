package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ASIGNACION_FINSOAMIGOS;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.CHK_ID_LLAMADAS_FINSOAMIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AsignacionLlamadaFinsoamigo implements Task {

  private static final int TIEMPO = 120;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(CHK_ID_LLAMADAS_FINSOAMIGO.of(numeroCredito), isPresent()).forNoMoreThan(TIEMPO).seconds(),
        MoveMouse.to(CHK_ID_LLAMADAS_FINSOAMIGO.of(numeroCredito)),
        JavaScriptClick.on(CHK_ID_LLAMADAS_FINSOAMIGO.of(numeroCredito)),
        WaitUntil.the(BTN_ASIGNACION_FINSOAMIGOS, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ASIGNACION_FINSOAMIGOS),
        WaitUntil.the(BTN_ACEPTAR, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ACEPTAR)
    );
  }
}
