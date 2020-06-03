package co.com.red5g.finsonet.interacions;

import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.getLogger;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import java.net.MalformedURLException;
import java.net.URL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ModificarUrl implements Interaction {

  public static ModificarUrl modificarUrl() {
    return new ModificarUrl();
  }

  String urlFinsonet = "https://finsonet.finsocial.com";

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      URL url = new URL(getProxiedDriver().getCurrentUrl());
      String nuevaUrl = urlFinsonet + url.getPath();
      BrowseTheWeb.as(actor).getDriver().navigate().to(nuevaUrl);
    } catch (MalformedURLException e) {
      getLogger().info("No encontro la url");
    }
  }
}
