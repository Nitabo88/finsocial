package co.com.red5g.finsonet.interacions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.devco.automation.mobile.actions.WaitFor;
import java.util.ArrayList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarPestanaActual implements Interaction {

  private static final int TIEMPO = 10;

  public static Performable cambiarPestanaActual() {
    return instrumented(CambiarPestanaActual.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitFor.seconds(CambiarPestanaActual.TIEMPO));
    ArrayList<String> lstVentanas = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
    BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(lstVentanas.size() - 1));
  }
}