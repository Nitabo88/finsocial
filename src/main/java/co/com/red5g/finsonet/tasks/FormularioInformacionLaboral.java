package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Seleccionar;
import co.com.red5g.finsonet.interacions.SeleccionarFecha;
import co.com.red5g.finsonet.models.ActividadLaboral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso3Page.*;

public class FormularioInformacionLaboral implements Task {
    private ActividadLaboral actividadLaboral;

    public FormularioInformacionLaboral(ActividadLaboral actividadLaboral) {
        this.actividadLaboral = actividadLaboral;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RBN_OCUPACION.of(actividadLaboral.getOcupacion())),
                Click.on(RBN_DECLARA_RENTA.of(actividadLaboral.getDeclaraRenta())),
                Click.on(RBN_IMPACTO_CARGO.of(actividadLaboral.getImpactoDecision())),
                Click.on(RBN_RECURSOS_PUBLICOS.of(actividadLaboral.getManejoRecursosPublicos())),
                Click.on(RBN_PERSONAJE_PUBLICO.of(actividadLaboral.getPersonaPublica())),
                Click.on(BTN_EMPRESA),
                Enter.theValue(actividadLaboral.getEmpresa()).into(FILTRO_LISTA).thenHit(Keys.ENTER),
                Enter.theValue(actividadLaboral.getCargo()).into(TXT_CARGO),
                SeleccionarFecha.ofConsult(
                        TXT_FECHA_VINCULACION, actividadLaboral.getFechaVinculacion()),
                Enter.theValue(actividadLaboral.getDireccionTrabajo()).into(TXT_DIRECCION_TRABAJO),
                Click.on(BTN_CERRAR_DIRECCION),
                Click.on(BTN_CIUDAD_TRABAJO),
                Enter.theValue(actividadLaboral.getCiudadTrabajo()).into(FILTRO_LISTA).thenHit(Keys.ENTER),
                Enter.theValue(actividadLaboral.getTelefonoTrabajo()).into(TXT_TELEFONO_TRABAJO),
                Enter.theValue(actividadLaboral.getExtension()).into(TXT_EXTENSION),
                Seleccionar.opcionLista(actividadLaboral.getTipoEmpresa(),BTN_TIPO_EMPRESA,LST_OPCIONES),
                Seleccionar.opcionLista(actividadLaboral.getTipoContrato(), BTN_TIPO_CONTRATO, LST_OPCIONES),
                Click.on(BTN_ACTIVIDAD_ECONOMICA),
                Click.on(LST_ACTIVIDAD_ECONOMICA.of(actividadLaboral.getActividadEconomica()))
        );
    }
}