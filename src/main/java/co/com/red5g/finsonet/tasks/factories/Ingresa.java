package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.Aprobacion;
import co.com.red5g.finsonet.tasks.AprobacionCreditoFinsoamigo;
import co.com.red5g.finsonet.tasks.ChequeoDocumentoFinsoamigo;
import co.com.red5g.finsonet.tasks.ChequeoDocumentoHuy;
import co.com.red5g.finsonet.tasks.ChequeoDocumentosRechazo;
import co.com.red5g.finsonet.tasks.InformacionCredito;
import co.com.red5g.finsonet.tasks.InformacionCreditoHuy;
import co.com.red5g.finsonet.tasks.InformacionLogin;
import co.com.red5g.finsonet.tasks.LiquidacionComisiones;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaLiberada;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaNueva;
import co.com.red5g.finsonet.tasks.LoguinUsuarioDocumentacion;
import co.com.red5g.finsonet.tasks.ModuloCdas;
import co.com.red5g.finsonet.tasks.ModuloCdasCompleto;
import co.com.red5g.finsonet.tasks.NuevoCreditoHuy;
import co.com.red5g.finsonet.tasks.ReporteAntecartera;
import co.com.red5g.finsonet.tasks.ReporteOriginacion;
import co.com.red5g.finsonet.tasks.ReporteVentaLiberada;
import co.com.red5g.finsonet.tasks.ReporteVentaNueva;
import net.serenitybdd.screenplay.Performable;

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
        return instrumented(InformacionCredito.class, credito);
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

    public static Performable alModuloCDAS() {
        return instrumented(ModuloCdas.class);
    }

    public static Performable alModuloCDASCompleto() {
        return instrumented(ModuloCdasCompleto.class);
    }

  public static Performable aChequeoDocumentosFinsoamigo() {
        return instrumented(ChequeoDocumentoFinsoamigo.class);
  }

    public static Performable aAprobacionFinsoamigo() {
        return instrumented(AprobacionCreditoFinsoamigo.class);
    }

    public static Performable aChequeoDocumentosHuy() {
        return instrumented(ChequeoDocumentoHuy.class);
    }

    public static Performable enNuevoCreditoHuy() {
        return instrumented(NuevoCreditoHuy.class);
    }
}