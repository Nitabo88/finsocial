package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.BTN_ACTIVIDAD_ECONOMICA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.BTN_CERRAR_DIRECCION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.BTN_CIUDAD_TRABAJO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.BTN_EMPRESA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.BTN_TIPO_CONTRATO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.BTN_TIPO_EMPRESA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.FILTRO_LISTA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.LST_ACTIVIDAD_ECONOMICA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.LST_OPCIONES;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.RDB_DECLARA_RENTA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.RDB_IMPACTO_CARGO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.RDB_OCUPACION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.RDB_PERSONAJE_PUBLICO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.RDB_RECURSOS_PUBLICOS;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.TXT_CARGO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.TXT_DIRECCION_TRABAJO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.TXT_EXTENSION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.TXT_FECHA_VINCULACION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso3Page.TXT_TELEFONO_TRABAJO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.red5g.interacions.Seleccionar;
import co.com.red5g.interacions.SeleccionarFecha;
import co.com.red5g.models.finsonet.ActividadLaboral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class FormularioInformacionLaboral implements Task {

    private static final int TIEMPO = 100;
    private final ActividadLaboral actividadLaboral;

    public FormularioInformacionLaboral(ActividadLaboral actividadLaboral) {
        this.actividadLaboral = actividadLaboral;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(RDB_OCUPACION.of(actividadLaboral.getOcupacion())),
            Click.on(RDB_DECLARA_RENTA.of(actividadLaboral.getDeclaraRenta())),
            Click.on(RDB_IMPACTO_CARGO.of(actividadLaboral.getImpactoDecision())),
            Click.on(RDB_RECURSOS_PUBLICOS.of(actividadLaboral.getManejoRecursosPublicos())),
            Click.on(RDB_PERSONAJE_PUBLICO.of(actividadLaboral.getPersonaPublica())),
            Click.on(BTN_EMPRESA),
            Enter.theValue(actividadLaboral.getEmpresa()).into(FILTRO_LISTA).thenHit(Keys.ENTER),
            Enter.theValue(actividadLaboral.getCargo()).into(TXT_CARGO),
            SeleccionarFecha.deConsulta(
                TXT_FECHA_VINCULACION, actividadLaboral.getFechaVinculacion()),
            Enter.theValue(actividadLaboral.getDireccionTrabajo()).into(TXT_DIRECCION_TRABAJO),
            Click.on(BTN_CERRAR_DIRECCION),
            WaitUntil.the(BTN_CIUDAD_TRABAJO, isEnabled()).forNoMoreThan(TIEMPO).seconds(),
            JavaScriptClick.on(BTN_CIUDAD_TRABAJO),
            Enter.theValue(actividadLaboral.getCiudadTrabajo()).into(FILTRO_LISTA).thenHit(Keys.ENTER),
            Enter.theValue(actividadLaboral.getTelefonoTrabajo()).into(TXT_TELEFONO_TRABAJO),
            Enter.theValue(actividadLaboral.getExtension()).into(TXT_EXTENSION),
            Seleccionar.opcionLista(actividadLaboral.getTipoEmpresa(), BTN_TIPO_EMPRESA, LST_OPCIONES),
            Seleccionar.opcionLista(actividadLaboral.getTipoContrato(), BTN_TIPO_CONTRATO, LST_OPCIONES),
            Click.on(BTN_ACTIVIDAD_ECONOMICA),
            Click.on(LST_ACTIVIDAD_ECONOMICA.of(actividadLaboral.getActividadEconomica()))
        );
    }
}