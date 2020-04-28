package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.LlamadasPage.BTN_ACEPTAR;
import static co.com.red5g.userinterfaces.finsonet.LlamadasPage.BTN_ASIGNACION_FINSOAMIGOS;
import static co.com.red5g.userinterfaces.finsonet.LlamadasPage.CHK_ID_LLAMADAS_FINSOAMIGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AsignacionLlamadaFinsoamigo implements Task {

  private static final int TIEMPO = 120;

  @Override
  public <T extends Actor> void performAs(T actor) {
    List<WebElementFacade> lstIdLlamadasFinsoamigo = CHK_ID_LLAMADAS_FINSOAMIGO.resolveAllFor(actor);
    actor.remember(NUMERO_CREDITO, lstIdLlamadasFinsoamigo.get(0).getAttribute("id").split("-")[1]);
    actor.attemptsTo(
        MoveMouse.to(lstIdLlamadasFinsoamigo.get(0)),
        JavaScriptClick.on(lstIdLlamadasFinsoamigo.get(0)),
        WaitUntil.the(BTN_ASIGNACION_FINSOAMIGOS, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ASIGNACION_FINSOAMIGOS),
        WaitUntil.the(BTN_ACEPTAR, isPresent()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_ACEPTAR)
    );
  }
}
