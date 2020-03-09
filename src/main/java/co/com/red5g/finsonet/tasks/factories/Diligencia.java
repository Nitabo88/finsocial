package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.*;
import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.tasks.*;
import net.serenitybdd.screenplay.Performable;

public class Diligencia {

    private Diligencia() {
    }

    public static Performable laInformacionDeChequeoDeDocumentos(final ChequeoDocumento chequeoDocumento) {
        return instrumented(InformacionChequeoDocumento.class, chequeoDocumento);
    }

    public static Performable laSolicitudDeCredito() {
        return instrumented(FormularioSolicitudCredito.class);
    }

    public static Performable laInformacionIncompletaDeChequeoDeDocumentos(final ChequeoDocumento chequeoDocumento) {
        return instrumented(InformacionIncompletaChequeoDocumentos.class, chequeoDocumento);
    }

    public static Performable laInformacionDeConfirmacion() {
        return instrumented(InformacionConfirmacion.class);
    }

    public static Performable laInformacionDeRegresoDeConfirmacion(final Confirmacion confirmacion) {
        return instrumented(RegresarConfirmacion.class, confirmacion);
    }

    public static Performable laInformacionDeRegresoDeAprobacionDeCredito(final AprobacionCredito aprobacionCredito) {
        return instrumented(RegresarAprobacionCredito.class, aprobacionCredito);
    }

    public static Performable laInformacionDeCreditoPendiente(final AprobacionCredito motivoPendiente) {
        return instrumented(AprobacionCreditoPendiente.class, motivoPendiente);
    }

    public static Performable laInformacionDeAprobacionDeCredito() {
        return instrumented(AprobacionDeCredito.class);
    }

    public static Performable laInformacionDeRegresoDeIncorporacion(Incorporacion motivoRegreso) {
        return instrumented(RegresarIncoporacion.class, motivoRegreso);
    }

    public static Performable laInformacionDeCreditoPendienteEnIncorporacion(Incorporacion motivoPendiente) {
        return instrumented(IncorporacionPendiente.class, motivoPendiente);
    }

    public static Performable ElVetoInterno(Vetados vetados) {
        return instrumented(RealizarVeto.class, vetados);
    }
}