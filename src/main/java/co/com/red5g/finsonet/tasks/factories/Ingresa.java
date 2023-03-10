package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.Aprobacion;
import co.com.red5g.finsonet.tasks.AprobacionCreditoFinsoamigo;
import co.com.red5g.finsonet.tasks.AprobacionLibranzaDigital;
import co.com.red5g.finsonet.tasks.ChequeoDocumento;
import co.com.red5g.finsonet.tasks.ChequeoDocumentoHuy;
import co.com.red5g.finsonet.tasks.ChequeoDocumentosRechazo;
import co.com.red5g.finsonet.tasks.ConfirmacionLibranzaDigital;
import co.com.red5g.finsonet.tasks.InformacionCreditoHuy;
import co.com.red5g.finsonet.tasks.InformacionCreditoLibranza;
import co.com.red5g.finsonet.tasks.InformacionErradaLogin;
import co.com.red5g.finsonet.tasks.InformacionIncompletaCreditoLibranza;
import co.com.red5g.finsonet.tasks.InformacionLogin;
import co.com.red5g.finsonet.tasks.LiquidacionComisiones;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaLiberada;
import co.com.red5g.finsonet.tasks.LiquidacionComisionesVentaNueva;
import co.com.red5g.finsonet.tasks.LoguinUsuarioDocumentacion;
import co.com.red5g.finsonet.tasks.ModuloCdas;
import co.com.red5g.finsonet.tasks.ModuloCdasCompleto;
import co.com.red5g.finsonet.tasks.NuevoCreditoHuy;
import co.com.red5g.finsonet.tasks.PDF;
import co.com.red5g.finsonet.tasks.ReporteAntecartera;
import co.com.red5g.finsonet.tasks.ReporteFinsoamigo;
import co.com.red5g.finsonet.tasks.Reporte;
import co.com.red5g.finsonet.tasks.ReporteOriginacion;
import co.com.red5g.finsonet.tasks.ReporteVentaLiberada;
import co.com.red5g.finsonet.tasks.ReporteVentaNueva;
import co.com.red5g.finsonet.tasks.TesoreriaFinsoamigo;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

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
        return instrumented(InformacionLogin.class, credenciales);    }

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

  public static Performable elRechazoDelCredito(co.com.red5g.finsonet.models.ChequeoDocumento motivo) {
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
    return instrumented(ChequeoDocumento.class);
  }

  public static Performable aAprobacionFinsoamigo(String perfilRiesgo) {
    return instrumented(AprobacionCreditoFinsoamigo.class, perfilRiesgo);
  }

  public static Performable aChequeoDocumentosHuy(Credito credito) {
    return instrumented(ChequeoDocumentoHuy.class, credito);
  }

  public static Performable enNuevoCreditoHuy() {
    return instrumented(NuevoCreditoHuy.class);
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

  public static Performable alPDF(String url, String numeroCredito) {
    return instrumented(PDF.class, url, numeroCredito);
  }

  public static Performable lasCredencialesErradas(Credenciales credenciales) {
    return instrumented(InformacionErradaLogin.class, credenciales);
  }

  public static Performable aChequeoDocumentos() {
    return instrumented(ChequeoDocumento.class);
  }

  public static Performable aConfirmacionLibranzaDigital() {
    return instrumented(ConfirmacionLibranzaDigital.class);
  }

  public static Performable aAprobacionDeLibranzaDigital() {
    return instrumented(AprobacionLibranzaDigital.class);
  }

  public static Performable enElReporte(Target lnkVerDetalle) {
    return instrumented(Reporte.class,lnkVerDetalle);
  }
}