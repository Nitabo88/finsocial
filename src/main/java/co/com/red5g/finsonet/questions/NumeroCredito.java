package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_MENSAJE_CREACION_CREDITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class NumeroCredito implements Question<String> {

  public static NumeroCredito elNumeroEs() {
    return new NumeroCredito();
  }

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(Ensure.that(LBL_MENSAJE_CREACION_CREDITO).isDisplayed());
    return LBL_MENSAJE_CREACION_CREDITO.resolveFor(actor).getText().split("ID: ")[1];
  }
}
