package co.com.red5g.bancoomeva.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.bancoomeva.tasks.Autenticacion;
import net.serenitybdd.screenplay.Performable;

public class Diligencia {

  public static Performable lasCredencialesDeAutenticacion(Credenciales credenciales) {
    return instrumented(Autenticacion.class,credenciales);
  }
}
