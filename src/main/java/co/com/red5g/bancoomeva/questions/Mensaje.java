package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LBL_MENSAJE_DASHBOARD;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Mensaje implements Question<String>{

  public static Question<String> deBienvenida( ) {
    return new Mensaje();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_MENSAJE_DASHBOARD.resolveFor(actor).getText();
  }
}
