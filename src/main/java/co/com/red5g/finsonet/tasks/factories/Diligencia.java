package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.tasks.FormularioSolicitudCredito;
import co.com.red5g.finsonet.tasks.OriginacionChequeoDocumento;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Diligencia {

    public static Performable laInformacionDeChequeoDeDocumentos(ChequeoDocumento chequeoDocumento) {
        return instrumented(OriginacionChequeoDocumento.class, chequeoDocumento);
    }

    public static Performable laSolicitudDeCredito() {
        return instrumented(FormularioSolicitudCredito.class);
    }
}