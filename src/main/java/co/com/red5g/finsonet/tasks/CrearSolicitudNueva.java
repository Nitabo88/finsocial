package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionRadicadosPage.BTN_NUEVO_PQRS;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.LBL_CREACION_PQRS;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.LST_ASUNTO;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.TXT_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.NuevaSolicitudPage.TXT_DOCUMENTO;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CrearSolicitudNueva implements Task {

    public static final String NUMERO_PQRS = "Numero Pqrs";
    private EquipoSatisfaccion equipoSatisfaccion;

    public CrearSolicitudNueva(EquipoSatisfaccion equipoSatisfaccion) {
        this.equipoSatisfaccion = equipoSatisfaccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, equipoSatisfaccion.getDocumentoEquipoSatisfaccion());
        actor.attemptsTo(
            Click.on(BTN_NUEVO_PQRS),
            WaitFor.seconds(TIEMPO_3),
            Enter.theValue(equipoSatisfaccion.getDocumentoEquipoSatisfaccion()).into(TXT_DOCUMENTO),
            SelectFromOptions.byVisibleText(equipoSatisfaccion.getAsunto()).from(LST_ASUNTO),
            Enter.theValue(equipoSatisfaccion.getDetalleEquipoSatisfaccion()).into(TXT_DETALLE),
            Click.on(BTN_GUARDAR),
            WaitUntil.the(LBL_CREACION_PQRS, isPresent()).forNoMoreThan(TIEMPO_10).seconds());
        String numeroPqrs = LBL_CREACION_PQRS.resolveFor(actor).getText().substring(26, 31);
        actor.remember(NUMERO_PQRS, numeroPqrs);
        actor.attemptsTo(Click.on(BTN_ACEPTAR));
    }
}
