package co.com.red5g.general.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ChangeUrl implements Interaction {

  private String url;

  public ChangeUrl(String url) {
    this.url = url;
  }

  public static ChangeUrl onBrowser(String url) {
    return new ChangeUrl(url);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String nuevaUrl = url;
    BrowseTheWeb.as(actor).getDriver().navigate().to(nuevaUrl);
  }
}
