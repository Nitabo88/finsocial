package co.com.red5g.bancoomeva.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ModificarUrl implements Interaction {

  private String url;

  public ModificarUrl(String url) {
    this.url = url;
  }

  public static ModificarUrl modificarUrl(String url) {
    return new ModificarUrl(url);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String nuevaUrl = url;
    BrowseTheWeb.as(actor).getDriver().navigate().to(nuevaUrl);
  }
}
