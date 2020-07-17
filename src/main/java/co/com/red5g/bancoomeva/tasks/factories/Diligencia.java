package co.com.red5g.bancoomeva.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.bancoomeva.tasks.Autenticacion;
import co.com.red5g.bancoomeva.tasks.CreditoLinea;
import co.com.red5g.bancoomeva.tasks.Firma;
import co.com.red5g.bancoomeva.tasks.SeguroVida;
import co.com.red5g.bancoomeva.tasks.Simulacion;
import co.com.red5g.bancoomeva.tasks.Validacion;
import net.serenitybdd.screenplay.Performable;

public class Diligencia {

  public static Performable lasCredencialesDeAutenticacion(Credenciales credenciales) {
    return instrumented(Autenticacion.class,credenciales);
  }

  public static Performable losPrimerosPasosDeUnCredito() {
    return instrumented(CreditoLinea.class);
  }

  public static Performable laValidacion() {
    return instrumented(Validacion.class);
  }

  public static Performable laSimulacion() {
    return instrumented(Simulacion.class);
  }

  public static Performable laFirmaDelCredito() {
    return instrumented(Firma.class);
  }

  public static Performable laInformacionDelSeguroDeVida() {
    return instrumented(SeguroVida.class);
  }
}
