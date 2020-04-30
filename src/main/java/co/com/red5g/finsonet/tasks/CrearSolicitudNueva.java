package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionRadicadosPage.BTN_NUEVO_SOLICITUD;
import static co.com.red5g.finsonet.userinterfaces.EnquestaFidelizacionPage.*;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.*;
import static co.com.red5g.utils.UtileriaFechas.formatearFechaServidorUTC;
import static co.com.red5g.utils.Utilerias.random;

public class CrearSolicitudNueva implements Task {

    private EquipoSatisfaccion equipoSatisfaccion;

    public CrearSolicitudNueva(EquipoSatisfaccion equipoSatisfaccion) {
        this.equipoSatisfaccion = equipoSatisfaccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(FECHA, formatearFechaServidorUTC());
        actor.remember(CEDULA_ACTOR, equipoSatisfaccion.getDocumentoEquipoSatisfaccion());
        String canalContacto = String.valueOf(random(2, 11));
        actor.attemptsTo(
                Click.on(BTN_NUEVO_SOLICITUD),
                WaitFor.seconds(1),
                Click.on(BTN_CANAL_CONTACTO.of(canalContacto)));
        actor.attemptsTo(
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO),
                SelectFromOptions.byVisibleText(equipoSatisfaccion.getAsunto()).from(LST_ASUNTO),
                Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE),
                Click.on(BTN_PRIMER_CONTACTO),
                SelectFromOptions.byVisibleText(equipoSatisfaccion.getProtocolo()).from(LST_PROTOCOLOS),
                JavaScriptClick.on(BTN_RESPUESTA_PROTOCOLO),
                Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE_PROTOCOLO),
                Click.on(BTN_ENVIAR_PROTOCOLO),
                JavaScriptClick.on(BTN_CLOSE_PROTOCOLO),
                JavaScriptClick.on(BTN_REALIZAR_ENCUESTA));
        actor.attemptsTo(
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO_ENCUESTA),
                JavaScriptClick.on(RDB_PREGUNTA_1),
                JavaScriptClick.on(RDB_PREGUNTA_2),
                WaitFor.seconds(1),
                JavaScriptClick.on(BTN_ENCUESTA_GUARDAR),
                WaitFor.seconds(1),
                Click.on(BTN_ACEPTAR)
        );
    }
}
