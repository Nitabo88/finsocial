package co.com.red5g.finsonet.tasks.factories;

import co.com.red5g.finsonet.models.*;
import co.com.red5g.finsonet.tasks.*;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Escribe {

    public static Performable elDetalleDeLaInformacionFinanciera(InformacionFinanciera informacionFinanciera) {
        return instrumented(FormularioInformacionFinanciera.class, informacionFinanciera);
    }

    public static Performable laInformacionDeLasReferencias(Referencias informacionReferenciaFamiliar, Referencias informacionReferenciaPersonal, Referencias informacionReferenciaFinanciera) {
        return instrumented(FormularioInformacionReferencias.class, informacionReferenciaFamiliar, informacionReferenciaPersonal, informacionReferenciaFinanciera);
    }

    public static Performable laInformacionDelBalancePersonal(InformacionBalancePersonal informacionBalancePersonal) {
        return instrumented(FormularioBalancePersonal.class, informacionBalancePersonal);
    }

    public static Performable laInformacionDelConyugue(InformacionPersonal informacionPersonalConyugue, InformacionConyugue informacionConyugue) {
        return instrumented(FormularioInformacionConyugue.class, informacionPersonalConyugue, informacionConyugue);
    }

    public static Performable laInformacionDeLosActivos(DescripcionActivos descripcionActivos) {
        return instrumented(FormularioInformacionActivos.class, descripcionActivos);
    }

    public static Performable laInformacionDelPrestamo(InformacionPrestamo informacionPrestamo) {
        return instrumented(FormularioInformacionPrestamo.class, informacionPrestamo);
    }

    public static Performable laInformacionLaboral(ActividadLaboral actividadLaboral) {
        return instrumented(FormularioInformacionLaboral.class, actividadLaboral);
    }

    public static Performable laInformacionPersonal(InformacionPersonal informacionPersonal) {
        return instrumented(FormularioInformacionPersonal.class, informacionPersonal);
    }

    public static Performable losDocumentosRequeridos(DocumentosRequeridos documentosRequeridos) {
        return instrumented(FormularioDocumentosRequeridos.class, documentosRequeridos);
    }
}