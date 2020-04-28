package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.LlamadasPage.BTN_ACEPTAR;
import static co.com.red5g.userinterfaces.finsonet.LlamadasPage.BTN_ASIGNACION_HUY;
import static co.com.red5g.userinterfaces.finsonet.LlamadasPage.CHK_ID_LLAMADAS_CREDIHUY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AsignacionLlamadaCrediHuy implements Task {

  private static final int TIEMPO = 100;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(CHK_ID_LLAMADAS_CREDIHUY.of(numeroCredito), isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(CHK_ID_LLAMADAS_CREDIHUY.of(numeroCredito)),
        WaitUntil.the(BTN_ASIGNACION_HUY, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ASIGNACION_HUY),
        WaitUntil.the(BTN_ACEPTAR, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ACEPTAR)
    );
  }
}
