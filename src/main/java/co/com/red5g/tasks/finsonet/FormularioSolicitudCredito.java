package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.models.builders.finsonet.ActividadLaboralBuilder.es;
import static co.com.red5g.models.builders.finsonet.DescripcionActivosBuilder.por;
import static co.com.red5g.models.builders.finsonet.DocumentoRequeridosBuilder.los;
import static co.com.red5g.models.builders.finsonet.InformacionConyugueBuilder.e;
import static co.com.red5g.models.builders.finsonet.InformacionPersonalBuilder.cualEs;
import static co.com.red5g.models.builders.finsonet.InformacionPrestamoBuilder.la;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso8Page.BTN_ACEPTAR_ENCUESTA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso8Page.BTN_ENCUESTA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso8Page.BTN_ENVIAR_ENCUESTA;

import co.com.red5g.models.builders.finsonet.InformacionBalancePersonalBuilder;
import co.com.red5g.models.builders.finsonet.InformacionFinancieraBuilder;
import co.com.red5g.models.builders.finsonet.ReferenciasBuilder;
import co.com.red5g.tasks.factories.finsonet.Escribe;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso1Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso4Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso5Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso6Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso7Page;
import co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso8Page;
import co.com.red5g.utils.Utilerias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class FormularioSolicitudCredito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String respuestaEncuesta = String.valueOf(Utilerias.random(1, 5));
        actor.attemptsTo(
            Escribe.losDocumentosRequeridos(los().documentosSolicitante()),
            Escribe.laInformacionDelPrestamo(la().informacionPrestamo()),
            Click.on(FormularioSolicitudPaso1Page.BTN_GUARDAR_CONTINUAR),
            Escribe.laInformacionPersonal(cualEs().informacionPersonal()),
            Click.on(FormularioSolicitudPaso2Page.BTN_GUARDAR_CONTINUAR),
            Escribe.laInformacionLaboral(es().actividadLaboral()),
            Click.on(FormularioSolicitudPaso3Page.BTN_GUARDAR_CONTINUAR),
            Escribe.laInformacionDelBalancePersonal(InformacionBalancePersonalBuilder.la().persona()),
            Escribe.laInformacionDeLosActivos(por().laPersona()),
            Escribe.elDetalleDeLaInformacionFinanciera(InformacionFinancieraBuilder.la().persona()),
            Click.on(FormularioSolicitudPaso4Page.BTN_GUARDAR_CONTINUAR),
            Escribe.laInformacionDelConyugue(cualEs().informacionPersonalConyugue(), e().informacionLaboralConyugue()),
            Click.on(FormularioSolicitudPaso5Page.BTN_GUARDAR_CONTINUAR),
            Escribe.laInformacionDeLasReferencias(
                ReferenciasBuilder.es().informacionReferenciaFamiliar(),
                ReferenciasBuilder.es().informacionReferenciaPersonal(),
                ReferenciasBuilder.es().informacionReferenciaFinanciera()),
            Click.on(FormularioSolicitudPaso6Page.BTN_GUARDAR_CONTINUAR),
            Click.on(FormularioSolicitudPaso7Page.BTN_GUARDAR_CONTINUAR),
            Click.on(FormularioSolicitudPaso8Page.BTN_ENVIAR),
            JavaScriptClick.on(BTN_ENCUESTA.of(respuestaEncuesta)),
            JavaScriptClick.on(BTN_ENVIAR_ENCUESTA),
            JavaScriptClick.on(BTN_ACEPTAR_ENCUESTA),
            cerrarPestana(),
            cambiarPestana()
        );
    }
}