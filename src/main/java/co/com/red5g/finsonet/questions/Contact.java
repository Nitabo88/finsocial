package co.com.red5g.finsonet.questions;

import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.*;

public class Contact implements Question<Boolean> {
    private EquipoSatisfaccion equipoSatisfaccion;

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(MNM_EQUIPO_SATISFACCION),
                Click.on(MNM_CONTACT_CENTER),
                Click.on(SPN_RADICADO_BUSQUEDA),
                Click.on(MNM_BUSQUEDA_CONTACT),
                Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO),
                Click.on(BTN_BUSQUEDA_CONTACT));
        return true;
    }
}
