package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionDeCredito implements Task {

  private static final int TIEMPO = 120;

  @Override
  public <T extends Actor> void performAs(final T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of(numeroCredito)),
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(AprobacionDeCredito.TIEMPO).seconds(),
        JavaScriptClick.on(BTN_APROBAR),
        WaitUntil.the(BTN_OK, isVisible()),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
