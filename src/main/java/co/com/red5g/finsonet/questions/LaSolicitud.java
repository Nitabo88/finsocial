package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.tasks.CrearSolicitudNueva.NUMERO_PQRS;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionRadicadosPage.LST_NUEVOS_INGRESOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class LaSolicitud implements Question<String> {

    private static final int TIEMPO = 60;

    public static LaSolicitud deContacto() {
        return new LaSolicitud();
    }

    @Override
    public String answeredBy(Actor actor) {
        String numeroPqrs = actor.recall(NUMERO_PQRS);
        actor.attemptsTo(
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LST_NUEVOS_INGRESOS.of(numeroPqrs)));
        return LST_NUEVOS_INGRESOS.of(numeroPqrs).resolveFor(actor).getTextContent();
    }
}
