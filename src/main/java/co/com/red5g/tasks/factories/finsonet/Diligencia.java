package co.com.red5g.tasks.factories.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.models.finsonet.AccionCdas;
import co.com.red5g.models.finsonet.AprobacionCredito;
import co.com.red5g.models.finsonet.ChequeoDocumento;
import co.com.red5g.models.finsonet.Confirmacion;
import co.com.red5g.models.finsonet.Incorporacion;
import co.com.red5g.models.finsonet.Vetados;
import co.com.red5g.models.finsonet.Tesoreria;
import co.com.red5g.tasks.finsonet.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public final class Diligencia {

    private Diligencia() {
    }

    public static Performable laInformacionDeChequeoDeDocumentosLibranza(ChequeoDocumento chequeoDocumento) {
        return Tasks.instrumented(InformacionChequeoDocumentoLibranza.class, chequeoDocumento);
    }

    public static Performable laSolicitudDeCredito() {
        return instrumented(FormularioSolicitudCredito.class);
    }

    public static Performable laInformacionIncompletaDeChequeoDeDocumentos(ChequeoDocumento chequeoDocumento) {
        return Tasks.instrumented(InformacionIncompletaChequeoDocumentos.class, chequeoDocumento);
    }

    public static Performable laInformacionDeConfirmacion() {
        return instrumented(InformacionConfirmacion.class);
    }

    public static Performable laInformacionDeRegresoDeConfirmacion(Confirmacion confirmacion) {
        return Tasks.instrumented(RegresarConfirmacion.class, confirmacion);
    }

    public static Performable laInformacionDeRegresoDeAprobacionDeCredito(AprobacionCredito aprobacionCredito) {
        return instrumented(RegresarAprobacionCredito.class, aprobacionCredito);
    }

    public static Performable laInformacionDeCreditoPendiente(AprobacionCredito motivoPendiente) {
        return instrumented(AprobacionCreditoPendiente.class, motivoPendiente);
    }

    public static Performable laInformacionDeAprobacionDeCredito() {
        return instrumented(AprobacionDeCreditoLibranza.class);
    }

    public static Performable laInformacionDeRegresoDeIncorporacion(final Incorporacion motivoRegreso) {
        return instrumented(RegresarIncoporacion.class, motivoRegreso);
    }

    public static Performable laInformacionDeCreditoPendienteEnIncorporacion(final Incorporacion motivoPendiente) {
        return instrumented(IncorporacionPendiente.class, motivoPendiente);
    }

    public static Performable elVetoInterno(final Vetados vetados) {
        return instrumented(RealizarVeto.class, vetados);
    }

    public static Performable laAprobacionDelCreditoEnIncorporacion(final Incorporacion aprobacion) {
        return instrumented(AprobacionIncorporacion.class, aprobacion);
    }

    public static Performable laInformacionDeRegresoDeFormalizacion(final co.com.red5g.models.finsonet.Formalizacion motivoRegreso) {
        return instrumented(RegresoFormalizacion.class, motivoRegreso);
    }

    public static Performable laInformacionDePendienteConfirmacion(final Confirmacion motivoPendiente) {
        return instrumented(PendienteConfirmacion.class,motivoPendiente);
    }

    public static Performable laInformacionFormalizacionPendiente(co.com.red5g.models.finsonet.Formalizacion motivoPendiente) {
        return instrumented(PendienteFormalizacion.class, motivoPendiente);
    }

    public static Performable laAprobacionDelCreditoEnFormalizacion() {
        return instrumented(AprobacionFormalizacion.class);
    }

    public static Performable laInformacionDeRegresoDeTesoreria(Tesoreria motivoRegreso) {
        return instrumented(RegresoTesoreria.class, motivoRegreso);
    }

    public static Performable laInformacionTesoreriaPendiente(Tesoreria motivoPendiente) {
        return instrumented(PendienteTesoreria.class, motivoPendiente);
    }

    public static Performable laInformacionDeLosDocumentos(AccionCdas accionCdas) {
        return instrumented(Cdas.class, accionCdas);
    }

    public static Performable laInformacionDeChequeoDeDocumentosFinsoamigo(ChequeoDocumento chequeoDocumento) {
        return instrumented(InformacionChequeoDocumentoFinsoamigo.class, chequeoDocumento);
    }

  public static Performable laInformacionDeAprobacionDeCreditoFinsoamigo() {
      return instrumented(AprobacionDeCreditoFinsoamigo.class);
  }

    public static Performable laInformacionDeChequeoDeDocumentosHuy(ChequeoDocumento chequeoDocumento) {
        return instrumented(InformacionChequeoDocumentoHuy.class, chequeoDocumento);
    }

    public static Performable laAprobacionDelCreditonEnIncorporacionHuy() {
        return instrumented(InformacionAprobacionHuy.class);
    }

    public static Performable laInformacionDeCreditoHuyPendiente(AprobacionCredito motivoPendiente) {
        return instrumented(AprobacionCreditoHuyPendiente.class, motivoPendiente);
    }

    public static Performable laAprobacionDelCreditoEnIncorporacionHuy(Incorporacion aprobacion) {
        return instrumented(AprobacionIncorporacionCreditoHuy.class, aprobacion);
    }
}