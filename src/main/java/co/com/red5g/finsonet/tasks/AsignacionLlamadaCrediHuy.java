package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.BTN_ASIGNACION_HUY;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.CHK_ID_LLAMADAS_CREDIHUY;
import static co.com.red5g.utils.data.Constantes.TIEMPO_10;
import static co.com.red5g.utils.data.Constantes.TIEMPO_120;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AsignacionLlamadaCrediHuy implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        WaitUntil.the(CHK_ID_LLAMADAS_CREDIHUY.of(numeroCredito), isPresent()).forNoMoreThan(TIEMPO_120).seconds(),
        JavaScriptClick.on(CHK_ID_LLAMADAS_CREDIHUY.of(numeroCredito)),
        WaitUntil.the(BTN_ASIGNACION_HUY, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
        JavaScriptClick.on(BTN_ASIGNACION_HUY),
        WaitUntil.the(BTN_ACEPTAR, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
        JavaScriptClick.on(BTN_ACEPTAR)
    );
  }
}
