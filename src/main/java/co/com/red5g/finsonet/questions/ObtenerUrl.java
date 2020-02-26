package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ObtenerUrl implements Question<String> {

  public static ObtenerUrl obtenerUrl() {
    return new ObtenerUrl();
  }

  @Override
  public String answeredBy(final Actor actor) {
    final String url = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    final String[] lstUrl = url.split("=");
    return lstUrl[1];
  }

}
