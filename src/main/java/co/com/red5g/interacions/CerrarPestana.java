package co.com.red5g.interacions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CerrarPestana implements Interaction {

  public static Performable cerrarPestana() {
    return instrumented(CerrarPestana.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    ArrayList<String> lstVentanas = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(1)).close();
    BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(0));
  }
}