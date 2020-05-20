package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.*;
import co.com.red5g.wiipo.tasks.InformacionLoginWiipo;
import net.serenitybdd.screenplay.Performable;

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
        return instrumented(InformacionCreditoLibranza.class, credito);
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

    public static Performable lasCredencialesWiipo(co.com.red5g.wiipo.models.Credenciales credenciales) {
        return instrumented(InformacionLoginWiipo.class, credenciales);
    }

    public static Performable laInformacionIncompletaDelCredito(Credito credito) {
        return instrumented(InformacionIncompletaCreditoLibranza.class, credito);
    }

    public static Performable aTesoreriaFinsoamigo() {
        return instrumented(TesoreriaFinsoamigo.class);
    }

    public static Performable enElReporteDeFinsoamigo() {
        return instrumented(ReporteFinsoamigo.class);
    }
}