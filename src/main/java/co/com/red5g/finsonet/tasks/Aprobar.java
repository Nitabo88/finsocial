package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Aprobar implements Task {

  private static final int TIEMPO = 120;
  private final AprobacionCredito perfilRiesgo;

  public Aprobar(final AprobacionCredito perfilRiesgo) {
    this.perfilRiesgo = perfilRiesgo;
  }

  public static Performable elCredito(final AprobacionCredito perfilRiesgo) {
    return instrumented(Aprobar.class, perfilRiesgo);
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    final String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of(numeroCredito)),
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(Aprobar.TIEMPO).seconds(),
        JavaScriptClick.on(BTN_APROBAR),
        WaitUntil.the(BTN_OK, isVisible()),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
