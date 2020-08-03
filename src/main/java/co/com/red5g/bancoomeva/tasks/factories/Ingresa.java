package co.com.red5g.bancoomeva.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.bancoomeva.tasks.IngresaFabricaDeCreditos;
import co.com.red5g.bancoomeva.tasks.IngresaFlujoCallCenter;
import co.com.red5g.bancoomeva.tasks.PaginaPrincipalBancomeva;
import net.serenitybdd.screenplay.Performable;

public class Ingresa {

  private Ingresa() {
  }

  public static Performable aBancoomeva() {
    return instrumented(PaginaPrincipalBancomeva.class);
  }

  public static Performable alFlujodeCallCenter(Credenciales credenciales) {
    return instrumented(IngresaFlujoCallCenter.class, credenciales);
  }

  public static Performable aLaFabricaDeCreditos(Credenciales credenciales) {
    return instrumented(IngresaFabricaDeCreditos.class, credenciales);
  }
}
