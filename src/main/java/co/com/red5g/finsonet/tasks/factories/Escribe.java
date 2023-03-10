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
import net.serenitybdd.screenplay.Tasks;

public final class Escribe {

    private Escribe() {
    }

    public static Performable elDetalleDeLaInformacionFinanciera(InformacionFinanciera informacionFinanciera) {
        return Tasks.instrumented(FormularioInformacionFinanciera.class, informacionFinanciera);
    }

    public static Performable laInformacionDeLasReferencias(Referencias informacionReferenciaFamiliar, Referencias informacionReferenciaPersonal,
                                                            Referencias informacionReferenciaFinanciera) {
        return instrumented(FormularioInformacionReferencias.class, informacionReferenciaFamiliar, informacionReferenciaPersonal, informacionReferenciaFinanciera);
    }

    public static Performable laInformacionDelBalancePersonal(InformacionBalancePersonal informacionBalancePersonal) {
        return Tasks.instrumented(FormularioBalancePersonal.class, informacionBalancePersonal);
    }

    public static Performable laInformacionDelConyugue(InformacionPersonal informacionPersonalConyugue, InformacionConyugue informacionConyugue) {
        return instrumented(FormularioInformacionConyugue.class, informacionPersonalConyugue, informacionConyugue);
    }

    public static Performable laInformacionDeLosActivos(DescripcionActivos descripcionActivos) {
        return Tasks.instrumented(FormularioInformacionActivos.class, descripcionActivos);
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