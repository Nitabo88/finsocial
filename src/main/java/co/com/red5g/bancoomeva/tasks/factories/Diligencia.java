package co.com.red5g.bancoomeva.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.bancoomeva.tasks.Autenticacion;
import co.com.red5g.bancoomeva.tasks.CreditoLinea;
import co.com.red5g.bancoomeva.tasks.FabricaCreditos;
import co.com.red5g.bancoomeva.tasks.FirmaAprobado;
import co.com.red5g.bancoomeva.tasks.FirmaPreAprobado;
import co.com.red5g.bancoomeva.tasks.SeguroVida;
import co.com.red5g.bancoomeva.tasks.Simulacion;
import co.com.red5g.bancoomeva.tasks.Validacion;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class Diligencia {

  private Diligencia() {
  }

  public static Performable lasCredencialesDeAutenticacion(Credenciales credenciales) {
    return instrumented(Autenticacion.class,credenciales);
  }

  public static Performable elCreditoConValoresMinimos(String sql) {
    return instrumented(CreditoLinea.class,sql);
  }

  public static Performable laValidacion(String sql) {
    return instrumented(Validacion.class, sql);
  }

  public static Performable laSimulacion() {
    return instrumented(Simulacion.class);
  }

  public static Performable laFirmaDelCredito() {
    return instrumented(FirmaAprobado.class);
  }

  public static Performable laInformacionDelSeguroDeVida() {
    return instrumented(SeguroVida.class);
  }

  public static Performable laFirmaDelCreditoPreAprobado() {
    return instrumented(FirmaPreAprobado.class);
  }

  public static Performable elProcesoEnFabricaDeCreditos(Target btnOperacion) {
    return instrumented(FabricaCreditos.class, btnOperacion);
  }
}
