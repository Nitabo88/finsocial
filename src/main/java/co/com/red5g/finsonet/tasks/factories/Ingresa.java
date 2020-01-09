package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.*;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresa {

    public static Performable enElReporteDeAntecartera() {
        return instrumented(ReporteAntecartera.class);
    }

    public static Performable enElReporteDeOriginacion() {
        return instrumented(ReporteOriginacion.class);
    }

    public static Performable enElReporteDeVentaLiberada() {
        return instrumented(ReporteVentaLiberada.class);
    }

    public static Performable enElReporteDeVentaNueva() {
        return instrumented(ReporteVentaNueva.class);
    }

    public static Performable laInformacionDelCredito(Credito credito) {
        return instrumented(InformacionCredito.class, credito);
    }

    public static Performable lasCredenciales(co.com.red5g.finsonet.models.Credenciales credenciales) {
        return instrumented(InformacionLogin.class, credenciales);
    }

    public static Performable enLiquidacionDeComisionesVentaNueva() {
        return instrumented(LiquidacionComisionesVentaNueva.class);
    }

    public static Performable enLiquidacionDeComisionesVentaLiberada() {
        return instrumented(LiquidacionComisionesVentaLiberada.class);
    }

  public static Performable ConUsuarioDeDocumentacion() {
      return instrumented(LoguinUsuarioDocumentacion.class);
  }
}