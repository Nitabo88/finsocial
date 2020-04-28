package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_NORMALIZAR_CREDITO_HUY;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_OK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Normalizar implements Task {

  public static Performable elCredito() {
    return instrumented(Normalizar.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Click.on(BTN_NORMALIZAR_CREDITO_HUY.of(numeroCredito)),
        Click.on(BTN_OK)
    );
  }
}
