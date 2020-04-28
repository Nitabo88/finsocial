package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.LBL_NOMBRE_FINSOAMIGO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

import co.com.red5g.questions.ObtenerUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionDeCreditoFinsoamigo implements Task {

  private static final int TIEMPO = 10;

  @Override
  public <T extends Actor> void performAs(T actor) {
    List<WebElementFacade> lstNombreAprobacionFinsoamigo = LBL_NOMBRE_FINSOAMIGO.resolveAllFor(actor);
    actor.attemptsTo(
        JavaScriptClick.on(lstNombreAprobacionFinsoamigo.get(0)));
    actor.remember(NUMERO_CREDITO, ObtenerUrl.obtenerUrl());
    actor.attemptsTo(
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        MoveMouse.to(BTN_APROBAR),
        JavaScriptClick.on(BTN_APROBAR),
        WaitUntil.the(BTN_OK, isVisible()),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
