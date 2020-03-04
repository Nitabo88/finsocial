package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CrearSolicitudContact implements Task {
    private EquipoSatisfaccion equipoSatisfaccion;

    public CrearSolicitudContact(EquipoSatisfaccion equipoSatisfaccion) {
        this.equipoSatisfaccion = equipoSatisfaccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NUEVO_CONTACT),
                Click.on(BTN_CANAL_CONTACTO),
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO),
                SelectFromOptions.byVisibleText("SOLICITUD DE DETALLE DE CRÉDITO").from(LST_ASUNTO),
                Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE),
                Click.on(BTN_PRIMER_CONTACTO),
                SelectFromOptions.byVisibleText("Envio detalle de credito").from(LST_PROTOCOLOS),
                JavaScriptClick.on(BTN_RESPUESTA_PROTOCOLO),
                Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE_PROTOCOLO),
                Click.on(BTN_ENVIAR_PROTOCOLO),
                JavaScriptClick.on(BTN_CLOSE_PROTOCOLO),
                JavaScriptClick.on(BTN_REALIZAR_ENCUESTA),
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO_ENCUESTA),
                JavaScriptClick.on(SPN_PREGUNTA_1),
                JavaScriptClick.on(SPN_PREGUNTA_2),
                WaitUntil.the(BTN_ENCUESTA_GUARDAR, isCurrentlyVisible()).forNoMoreThan(3).seconds(),
                JavaScriptClick.on(BTN_ENCUESTA_GUARDAR)
        );
    }
}
