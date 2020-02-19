package co.com.red5g.finsonet.questions;


import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.*;
import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.LST_FILA_CONFIRMACION;

public class Contact implements Question<Boolean> {
    private EquipoSatisfaccion equipoSatisfaccion;

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(MNU_EQUIPO_SATISFACCION),
                Click.on(MNU_CONTACT_CENTER),
                Click.on(SPN_RADICADO_BUSQUEDA),
                Click.on(MNU_BUSQUEDA_CONTACT),
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO),
                Click.on(BTN_BUSQUEDA_CONTACT)
        );
        SeleccionarFila lstFila = seleccionarFila(LST_FILA_CONFIRMACION, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO));
        return lstFila.answeredBy(actor).isPresent();    }
}
