package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.ActividadLaboral;
import co.com.red5g.finsonet.models.DescripcionActivos;
import co.com.red5g.finsonet.models.DocumentosRequeridos;
import co.com.red5g.finsonet.models.InformacionBalancePersonal;
import co.com.red5g.finsonet.models.InformacionConyugue;
import co.com.red5g.finsonet.models.InformacionFinanciera;
import co.com.red5g.finsonet.models.InformacionPersonal;
import co.com.red5g.finsonet.models.InformacionPrestamo;
import co.com.red5g.finsonet.models.Referencias;
import co.com.red5g.finsonet.tasks.FormularioBalancePersonal;
import co.com.red5g.finsonet.tasks.FormularioDocumentosRequeridos;
import co.com.red5g.finsonet.tasks.FormularioInformacionActivos;
import co.com.red5g.finsonet.tasks.FormularioInformacionConyugue;
import co.com.red5g.finsonet.tasks.FormularioInformacionFinanciera;
import co.com.red5g.finsonet.tasks.FormularioInformacionLaboral;
import co.com.red5g.finsonet.tasks.FormularioInformacionPersonal;
import co.com.red5g.finsonet.tasks.FormularioInformacionPrestamo;
import co.com.red5g.finsonet.tasks.FormularioInformacionReferencias;
import net.serenitybdd.screenplay.Performable;

public class Escribe {

    private Escribe() {
    }

    public static Performable elDetalleDeLaInformacionFinanciera(final InformacionFinanciera informacionFinanciera) {
        return instrumented(FormularioInformacionFinanciera.class, informacionFinanciera);
    }

    public static Performable laInformacionDeLasReferencias(final Referencias informacionReferenciaFamiliar, final Referencias informacionReferenciaPersonal,
        final Referencias informacionReferenciaFinanciera) {
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