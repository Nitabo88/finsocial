package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.LBL_GESTION_DOCUMENTAL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GestionDocumental implements Question<String> {

  public static Question<String> completa() {
    return new GestionDocumental();
  }

  @Override
  public String answeredBy(Actor actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    return LBL_GESTION_DOCUMENTAL.of(numeroCredito).resolveFor(actor).getText();
  }
}