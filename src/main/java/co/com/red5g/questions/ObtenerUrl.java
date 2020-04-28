package co.com.red5g.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ObtenerUrl implements Question<String> {

  public static ObtenerUrl obtenerUrl() {
    return new ObtenerUrl();
  }

  @Override
  public String answeredBy(Actor actor) {
    String url = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    String[] lstUrl = url.split("=");
    return lstUrl[1].replaceAll("[^\\d]", "");
  }
}
