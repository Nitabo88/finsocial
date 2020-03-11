package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.models.Formalizacion;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.models.Tesoreria;
import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.*;
import net.serenitybdd.screenplay.Performable;

public final class Diligencia {

    private Diligencia() {
    }

    public static Performable laInformacionDeChequeoDeDocumentos(ChequeoDocumento chequeoDocumento) {
        return instrumented(InformacionChequeoDocumento.class, chequeoDocumento);
    }

    public static Performable laSolicitudDeCredito() {
        return instrumented(FormularioSolicitudCredito.class);
    }

    public static Performable laInformacionIncompletaDeChequeoDeDocumentos(ChequeoDocumento chequeoDocumento) {
        return instrumented(InformacionIncompletaChequeoDocumentos.class, chequeoDocumento);
    }

    public static Performable laInformacionDeConfirmacion() {
        return instrumented(InformacionConfirmacion.class);
    }

    public static Performable laInformacionDeRegresoDeConfirmacion(Confirmacion confirmacion) {
        return instrumented(RegresarConfirmacion.class, confirmacion);
    }

    public static Performable laInformacionDeRegresoDeAprobacionDeCredito(AprobacionCredito aprobacionCredito) {
        return instrumented(RegresarAprobacionCredito.class, aprobacionCredito);
    }

    public static Performable laInformacionDeCreditoPendiente(AprobacionCredito motivoPendiente) {
        return instrumented(AprobacionCreditoPendiente.class, motivoPendiente);
    }

    public static Performable laInformacionDeAprobacionDeCredito() {
        return instrumented(AprobacionDeCredito.class);
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

    public static Performable laInformacionDeRegresoDeFormalizacion(final Formalizacion motivoRegreso) {
        return instrumented(RegresoFormalizacion.class, motivoRegreso);
    }

    public static Performable laInformacionDePendienteConfirmacion(final Confirmacion motivoPendiente) {
        return instrumented(PendienteConfirmacion.class,motivoPendiente);
    }

    public static Performable laInformacionFormalizacionPendiente(Formalizacion motivoPendiente) {
        return instrumented(PendienteFormalizacion.class, motivoPendiente);
    }

    public static Performable laAprobacionDelCreditoEnFormalizacion() {
        return instrumented(AprobacionFormalizacion.class);
    }

  public static Performable laInformacionDeRegresoDeTesoreria(Tesoreria motivoRegreso) { return instrumented(RegresoTesoreria.class, motivoRegreso);
  }

    public static Performable laInformacionTesoreriaPendiente(Tesoreria motivoPendiente) {
        return instrumented(PendienteTesoreria.class, motivoPendiente);
    }
}