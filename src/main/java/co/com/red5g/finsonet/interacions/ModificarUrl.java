package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ModificarUrl implements Interaction {

  private String urlPdf;

  public ModificarUrl(String urlPdf) {
    this.urlPdf = urlPdf;
  }

  public static ModificarUrl modificarUrl(String pdf) {
    return new ModificarUrl(pdf);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String nuevaUrl = urlPdf;
    BrowseTheWeb.as(actor).getDriver().navigate().to(nuevaUrl);
  }
}
