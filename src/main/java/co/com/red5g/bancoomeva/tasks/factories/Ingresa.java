package co.com.red5g.bancoomeva.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.tasks.PaginaPrincipalBancomeva;
import net.serenitybdd.screenplay.Performable;

public class Ingresa {

  public static Performable aHome() {
    return instrumented(PaginaPrincipalBancomeva.class);
  }
}
