package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.models.FormularioSolicitud;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SolicitudCreditoBack implements Task {

    Credenciales credenciales;
    FormularioSolicitud formularioSolicitud;
    String cedula;

    public SolicitudCreditoBack(Credenciales credenciales, FormularioSolicitud formularioSolicitud, String cedula) {
        this.credenciales = credenciales;
        this.formularioSolicitud = formularioSolicitud;
        this.cedula = cedula;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Loguearse.enFinsonetBack(credenciales));
        String cookie = SerenityRest.lastResponse().getCookie("PHPSESSID");
        actor.attemptsTo(
            Diligencia.primerPasoFormulario(cookie, formularioSolicitud),
            Diligencia.segundoPasoFormulario(cookie, formularioSolicitud, cedula),
            Diligencia.tercerPasoFormulario(cookie, formularioSolicitud),
            Diligencia.cuartoPasoFormulario(cookie, formularioSolicitud),
            Diligencia.quintoPasoFormulario(cookie, formularioSolicitud),
            Diligencia.sextoPasoFormulario(cookie, formularioSolicitud),
            Diligencia.septimoPasoFormulario(cookie, formularioSolicitud),
            Diligencia.octavoPasoFormulario(cookie, formularioSolicitud, cedula)
        );
    }
}
