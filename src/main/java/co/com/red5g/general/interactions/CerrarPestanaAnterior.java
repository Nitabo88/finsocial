package co.com.red5g.general.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CerrarPestanaAnterior implements Interaction {

  public static Performable cerrarPestanaAnterior() {
    return instrumented(CerrarPestanaAnterior.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    ArrayList<String> lstVentanas = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(0)).close();
  }
}