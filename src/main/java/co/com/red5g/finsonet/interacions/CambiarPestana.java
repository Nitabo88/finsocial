package co.com.red5g.finsonet.interacions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarPestana implements Interaction {

  public static Performable cambiarPestana() {
    return instrumented(CambiarPestana.class);
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    final ArrayList<String> lstVentanas = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(0));
  }
}