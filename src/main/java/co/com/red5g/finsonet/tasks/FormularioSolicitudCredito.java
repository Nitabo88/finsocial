package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.models.builders.ActividadLaboralBuilder.es;
import static co.com.red5g.finsonet.models.builders.DescripcionActivosBuilder.por;
import static co.com.red5g.finsonet.models.builders.DocumentoRequeridosBuilder.los;
import static co.com.red5g.finsonet.models.builders.InformacionConyugueBuilder.e;
import static co.com.red5g.finsonet.models.builders.InformacionPersonalBuilder.cualEs;
import static co.com.red5g.finsonet.models.builders.InformacionPrestamoBuilder.la;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso8Page.BTN_ACEPTAR_ENCUESTA;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso8Page.BTN_ENCUESTA;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso8Page.BTN_ENVIAR_ENCUESTA;

import co.com.red5g.finsonet.models.builders.InformacionBalancePersonalBuilder;
import co.com.red5g.finsonet.models.builders.InformacionFinancieraBuilder;
import co.com.red5g.finsonet.models.builders.ReferenciasBuilder;
import co.com.red5g.finsonet.tasks.factories.Escribe;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso2Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso3Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso5Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso6Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso7Page;
import co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso8Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FormularioSolicitudCredito implements Task {

    public static final String FECHA_SOLICITUD_CREDITO = "fecha credito";
    public static final String VISITA_COLEGIO = "Visita al colegio";

    @Override
    public <T extends Actor> void performAs(T actor) {
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
            Click.on(BTN_ENCUESTA.of(VISITA_COLEGIO)),
            Click.on(BTN_ENVIAR_ENCUESTA),
            Click.on(BTN_ACEPTAR_ENCUESTA),
            cambiarPestana()
        );
    }
}