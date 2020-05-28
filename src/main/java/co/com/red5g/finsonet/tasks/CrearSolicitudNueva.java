package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionRadicadosPage.BTN_NUEVO_PQRS;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CrearSolicitudNueva implements Task {

    public static final String NUMERO_PQRS = "Numero Pqrs";
    private static final int TIEMPO = 20;
    private final EquipoSatisfaccion equipoSatisfaccion;

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
        actor.attemptsTo(Click.on(BTN_ACEPTAR));
    }
}
