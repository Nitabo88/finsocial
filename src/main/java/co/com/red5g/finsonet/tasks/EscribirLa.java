package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Seleccionar;
import co.com.red5g.finsonet.interacions.SelectDateInteraction;
import co.com.red5g.finsonet.models.ActividadLaboral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.*;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso3Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirLa implements Task {
    private ActividadLaboral actividadLaboral;

    public EscribirLa(ActividadLaboral actividadLaboral) {
        this.actividadLaboral = actividadLaboral;
    }

    public static Performable informacionLaboral(ActividadLaboral actividadLaboral) {
        return instrumented(EscribirLa.class, actividadLaboral);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RBN_OCUPACION.of(actividadLaboral.getOcupacion())),
                Click.on(RBN_DECLARA_RENTA.of(actividadLaboral.getDeclaraRenta())),
                Click.on(RBN_IMPACTO_CARGO.of(actividadLaboral.getImpactoDecision())),
                Click.on(RBN_RECURSOS_PUBLICOS.of(actividadLaboral.getManejoRecursosPublicos())),
                Click.on(RBN_PERSONAJE_PUBLICO.of(actividadLaboral.getPersonaPublica())),
                Enter.theValue(actividadLaboral.getCargo()).into(TXT_CARGO),
                Enter.theValue(actividadLaboral.getTelefonoTrabajo()).into(TXT_TELEFONO_TRABAJO),
                Enter.theValue(actividadLaboral.getExtension()).into(TXT_EXTENSION),
                Seleccionar.opcionLista(actividadLaboral.getTipoEmpresa(),BTN_TIPO_EMPRESA,LST_OPCIONES),
                Seleccionar.opcionLista(actividadLaboral.getActividadEconomica(),BTN_ACTIVIDAD_ECONOMICA,LST_OPCIONES),
                Seleccionar.opcionLista(actividadLaboral.getTipoContrato(),BTN_TIPO_CONTRATO,LST_OPCIONES),
                SelectDateInteraction.ofConsult(
                        TXT_FECHA_VINCULACION, actividadLaboral.getFechaVinculacion(), DATA_PICKER_YEAR, DATA_PICKER_MONTH, DATA_PICKER_DAY, BTN_ARROW_LEFT, BTN_ARROW_RIGHT, BTN_DATA_PICKER_DAY, BTN_DATA_PICKER_MONTH, BTN_DATA_PICKER_YEAR),
                Enter.theValue(actividadLaboral.getDireccionTrabajo()).into(TXT_DIRECCION_TRABAJO),
                Click.on(BTN_CERRAR_DIRECCION),
                Click.on(BTN_EMPRESA),
                Enter.theValue(actividadLaboral.getEmpresa()).into(FILTRO_LISTA).thenHit(Keys.ENTER),
                Click.on(BTN_CIUDAD_TRABAJO),
                Enter.theValue(actividadLaboral.getCiudadTrabajo()).into(FILTRO_LISTA).thenHit(Keys.ENTER)
        );
    }
}