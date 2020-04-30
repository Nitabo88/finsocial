package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.List;

import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionRadicadosPage.*;

public class LaSolicitud implements Question<String> {

    public static LaSolicitud deContacto() {
        return new LaSolicitud();
    }

    @Override
    public String answeredBy(Actor actor) {
        String fecha = actor.recall(FECHA);
        String numeroDocumento = actor.recall(CEDULA_ACTOR);
        actor.attemptsTo(
                JavaScriptClick.on(RDB_DOCUMENTO),
                Enter.theValue(numeroDocumento).into(TXT_BUSQUEDA),
                Click.on(BTN_BUSQUEDA));
        List<WebElementFacade> lstSolicitudContactCenter = LST_SOLICITUD_CONTACT_CENTER.of(fecha).resolveAllFor(actor);
        return lstSolicitudContactCenter.get(0).getText();
    }
}
