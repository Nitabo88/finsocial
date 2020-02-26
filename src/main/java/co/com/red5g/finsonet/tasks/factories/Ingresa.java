package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.Aprobacion;
import co.com.red5g.finsonet.tasks.ChequeoDocumentosRechazo;
import co.com.red5g.finsonet.tasks.InformacionCredito;
import co.com.red5g.finsonet.tasks.InformacionCreditoHuy;
import co.com.red5g.finsonet.tasks.InformacionLogin;
import co.com.red5g.finsonet.tasks.LiquidacionComisiones;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaLiberada;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaNueva;
import co.com.red5g.finsonet.tasks.LoguinUsuarioDocumentacion;
import co.com.red5g.finsonet.tasks.ReporteAntecartera;
import co.com.red5g.finsonet.tasks.ReporteOriginacion;
import co.com.red5g.finsonet.tasks.ReporteVentaLiberada;
import co.com.red5g.finsonet.tasks.ReporteVentaNueva;
import net.serenitybdd.screenplay.Performable;

public class Ingresa {

    private Ingresa() {
    }

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

    public static Performable laInformacionDelCredito(final Credito credito) {
        return instrumented(InformacionCredito.class, credito);
    }

    public static Performable lasCredenciales(final co.com.red5g.finsonet.models.Credenciales credenciales) {
        return instrumented(InformacionLogin.class, credenciales);
    }

    public static Performable enLiquidacionDeComisionesVentaNueva() {
        return instrumented(LiquidacionComisionesVentaNueva.class);
    }

    public static Performable enLiquidacionDeComisionesVentaLiberada() {
        return instrumented(LiquidacionComisionesVentaLiberada.class);
    }

    public static Performable conUsuarioDeDocumentacion() {
        return instrumented(LoguinUsuarioDocumentacion.class);
    }

    public static Performable alReporteDeLiquidacionDeComisiones(final String ciclo) {
        return instrumented(LiquidacionComisiones.class, ciclo);
    }

    public static Performable elRechazoDelCredito(final ChequeoDocumento motivo) {
        return instrumented(ChequeoDocumentosRechazo.class, motivo);
    }

    public static Performable enAprobacion() {
        return instrumented(Aprobacion.class);
    }

    public static Performable laInformacionDelCreditoHuy(Credito informacionDelCreditoHuy) {
        return instrumented(InformacionCreditoHuy.class, informacionDelCreditoHuy);
    }
}