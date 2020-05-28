package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarPestana implements Interaction {

  public static Performable cambiarPestana() {
    return instrumented(CambiarPestana.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    ArrayList<String> lstVentanas = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(0));
  }
}