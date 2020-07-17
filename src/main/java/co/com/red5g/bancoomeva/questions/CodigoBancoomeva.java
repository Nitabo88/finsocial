package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LBL_CORREO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CodigoBancoomeva implements Question<String> {

  public static Question<String> numeroCodigo() {
    return new CodigoBancoomeva();
  }

  @Override
  public String answeredBy(Actor actor) {
    String correo = LBL_CORREO.resolveAllFor(actor).get(0).getTextContent();
    String codigo = correo.split(": ")[1].substring(0, 9);
    return codigo;
  }

}
