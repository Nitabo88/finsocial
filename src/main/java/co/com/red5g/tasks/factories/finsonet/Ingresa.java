package co.com.red5g.tasks.factories.finsonet;

import co.com.red5g.models.finsonet.ChequeoDocumento;
import co.com.red5g.models.finsonet.Credenciales;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.finsonet.*;
import co.com.red5g.tasks.wiipo.InformacionLoginWiipo;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public final class Ingresa {

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

    public static Performable laInformacionDelCredito(Credito credito) {
        return Tasks.instrumented(InformacionCreditoLibranza.class, credito);
    }

    public static Performable lasCredenciales(Credenciales credenciales) {
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

    public static Performable alReporteDeLiquidacionDeComisiones(String ciclo) {
        return instrumented(LiquidacionComisiones.class, ciclo);
    }

    public static Performable elRechazoDelCredito(ChequeoDocumento motivo) {
        return instrumented(ChequeoDocumentosRechazo.class, motivo);
    }

    public static Performable enAprobacion() {
        return instrumented(Aprobacion.class);
    }

    public static Performable laInformacionDelCreditoHuy(final Credito informacionDelCreditoHuy) {
        return instrumented(InformacionCreditoHuy.class, informacionDelCreditoHuy);
    }

    public static Performable alModuloCDAS(Credito credito) {
        return instrumented(ModuloCdas.class, credito);
    }

    public static Performable alModuloCDASCompleto(Credito credito) {
        return instrumented(ModuloCdasCompleto.class, credito);
    }

  public static Performable aChequeoDocumentosFinsoamigo() {
        return instrumented(ChequeoDocumentoFinsoamigo.class);
  }

    public static Performable aAprobacionFinsoamigo() {
        return instrumented(AprobacionCreditoFinsoamigo.class);
    }

    public static Performable aChequeoDocumentosHuy(Credito credito) {
        return instrumented(ChequeoDocumentoHuy.class, credito);
    }

    public static Performable enNuevoCreditoHuy() {
        return instrumented(NuevoCreditoHuy.class);
    }

    public static Performable lasCredencialesWiipo(co.com.red5g.models.wiipo.Credenciales credenciales) {
        return instrumented(InformacionLoginWiipo.class, credenciales);
    }
}