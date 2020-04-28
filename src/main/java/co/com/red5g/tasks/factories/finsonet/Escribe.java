package co.com.red5g.tasks.factories.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.models.finsonet.ActividadLaboral;
import co.com.red5g.models.finsonet.DescripcionActivos;
import co.com.red5g.models.finsonet.DocumentosRequeridos;
import co.com.red5g.models.finsonet.InformacionBalancePersonal;
import co.com.red5g.models.finsonet.InformacionConyugue;
import co.com.red5g.models.finsonet.InformacionFinanciera;
import co.com.red5g.models.finsonet.InformacionPersonal;
import co.com.red5g.models.finsonet.InformacionPrestamo;
import co.com.red5g.models.finsonet.Referencias;
import co.com.red5g.tasks.finsonet.FormularioBalancePersonal;
import co.com.red5g.tasks.finsonet.FormularioDocumentosRequeridos;
import co.com.red5g.tasks.finsonet.FormularioInformacionActivos;
import co.com.red5g.tasks.finsonet.FormularioInformacionConyugue;
import co.com.red5g.tasks.finsonet.FormularioInformacionFinanciera;
import co.com.red5g.tasks.finsonet.FormularioInformacionLaboral;
import co.com.red5g.tasks.finsonet.FormularioInformacionPersonal;
import co.com.red5g.tasks.finsonet.FormularioInformacionPrestamo;
import co.com.red5g.tasks.finsonet.FormularioInformacionReferencias;
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