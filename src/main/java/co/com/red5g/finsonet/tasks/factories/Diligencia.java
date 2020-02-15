package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.tasks.AprobacionCreditoPendiente;
import co.com.red5g.finsonet.tasks.FormularioSolicitudCredito;
import co.com.red5g.finsonet.tasks.InformacionChequeoDocumento;
import co.com.red5g.finsonet.tasks.InformacionConfirmacion;
import co.com.red5g.finsonet.tasks.InformacionIncompletaChequeoDocumentos;
import co.com.red5g.finsonet.tasks.RegresarAprobacionCredito;
import co.com.red5g.finsonet.tasks.RegresarConfirmacion;
import net.serenitybdd.screenplay.Performable;

public class Diligencia {

    public Diligencia() {
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

}