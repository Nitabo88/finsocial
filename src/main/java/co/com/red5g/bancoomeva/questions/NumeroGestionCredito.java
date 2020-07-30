package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LBL_ID_GESTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumeroGestionCredito implements Question<String> {

  public static Question<String> numeroGestion() {
    return new NumeroGestionCredito ();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_ID_GESTION.resolveAllFor(actor).get(0).getTextContent().split("CODIGO DE RETOMAR GESTION ")[1].substring(0, 4);
  }
}
