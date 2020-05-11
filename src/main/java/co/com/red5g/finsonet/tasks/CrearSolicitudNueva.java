package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionRadicadosPage.BTN_NUEVO_PQRS;
import static co.com.red5g.finsonet.userinterfaces.EnquestaFidelizacionPage.*;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CrearSolicitudNueva implements Task {

    private static final String NUMERO_PQRS = "Numero Pqrs";
    private static final int TIEMPO = 20;
    private EquipoSatisfaccion equipoSatisfaccion;

    public CrearSolicitudNueva(EquipoSatisfaccion equipoSatisfaccion) {
        this.equipoSatisfaccion = equipoSatisfaccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, equipoSatisfaccion.getDocumentoEquipoSatisfaccion());
        actor.attemptsTo(
                Click.on(BTN_NUEVO_PQRS),
                WaitFor.seconds(1),
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO),
                SelectFromOptions.byVisibleText(equipoSatisfaccion.getAsunto()).from(LST_ASUNTO),
                Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE),
                Click.on(BTN_GUARDAR),
                WaitUntil.the(LBL_CREACION_PQRS, isPresent()).forNoMoreThan(TIEMPO).seconds());
        String numeroPqrs = LBL_CREACION_PQRS.resolveFor(actor).getText().substring(26, 31);
        actor.remember(NUMERO_PQRS, numeroPqrs);
        actor.attemptsTo(
                Click.on(BTN_ACEPTAR),
                MoveMouse.to(LBL_NOMBRE_NUEVO_INGRESO_PQRS.of(numeroPqrs)),
                Click.on(LBL_NOMBRE_NUEVO_INGRESO_PQRS.of(numeroPqrs)));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(equipoSatisfaccion.getProtocolo()).from(LST_PROTOCOLOS),
                JavaScriptClick.on(BTN_RESPUESTA_PROTOCOLO),
                Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE_PROTOCOLO),
                Click.on(BTN_ENVIAR_PROTOCOLO),
                JavaScriptClick.on(BTN_CLOSE_PROTOCOLO),
                JavaScriptClick.on(BTN_REALIZAR_ENCUESTA));
        actor.attemptsTo(
                WaitFor.seconds(1),
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
