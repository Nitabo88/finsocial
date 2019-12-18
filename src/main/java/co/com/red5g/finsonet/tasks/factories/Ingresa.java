package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.Credenciales;
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

    public static Performable lasCredenciales(Credenciales credenciales) {
        return instrumented(SeAutentica.class, credenciales);
    }
}