package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.*;
import co.com.red5g.finsonet.tasks.*;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Escribe {

    public static Performable elDetalleDeLaInformacionFinanciera(final InformacionFinanciera informacionFinanciera) {
        return instrumented(FormularioInformacionFinanciera.class, informacionFinanciera);
    }

    public static Performable laInformacionDeLasReferencias(final Referencias informacionReferenciaFamiliar, final Referencias informacionReferenciaPersonal, final Referencias informacionReferenciaFinanciera) {
        return instrumented(FormularioInformacionReferencias.class, informacionReferenciaFamiliar, informacionReferenciaPersonal, informacionReferenciaFinanciera);
    }

    public static Performable laInformacionDelBalancePersonal(final InformacionBalancePersonal informacionBalancePersonal) {
        return instrumented(FormularioBalancePersonal.class, informacionBalancePersonal);
    }

    public static Performable laInformacionDelConyugue(final InformacionPersonal informacionPersonalConyugue, final InformacionConyugue informacionConyugue) {
        return instrumented(FormularioInformacionConyugue.class, informacionPersonalConyugue, informacionConyugue);
    }

    public static Performable laInformacionDeLosActivos(final DescripcionActivos descripcionActivos) {
        return instrumented(FormularioInformacionActivos.class, descripcionActivos);
    }

    public static Performable laInformacionDelPrestamo(final InformacionPrestamo informacionPrestamo) {
        return instrumented(FormularioInformacionPrestamo.class, informacionPrestamo);
    }

    public static Performable laInformacionLaboral(final ActividadLaboral actividadLaboral) {
        return instrumented(FormularioInformacionLaboral.class, actividadLaboral);
    }

    public static Performable laInformacionPersonal(final InformacionPersonal informacionPersonal) {
        return instrumented(FormularioInformacionPersonal.class, informacionPersonal);
    }

    public static Performable losDocumentosRequeridos(final DocumentosRequeridos documentosRequeridos) {
        return instrumented(FormularioDocumentosRequeridos.class, documentosRequeridos);
    }
}