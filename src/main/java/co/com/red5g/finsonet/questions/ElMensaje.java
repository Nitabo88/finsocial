package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_NOMBRE_COMPLETO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensaje implements Question<String> {

  public static ElMensaje noRegistra() {
    return new ElMensaje();
  }

  @Override
  public String answeredBy(final Actor actor) {
    return (TXT_NOMBRE_COMPLETO.resolveFor(actor).getValue());
  }
}
