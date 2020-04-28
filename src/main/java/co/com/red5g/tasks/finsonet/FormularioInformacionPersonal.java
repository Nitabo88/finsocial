package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_CERRAR_DIRECCION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_CIUDAD_DEPARTAMENTO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_CORRESPONDENCIA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_ESTADO_CIVIL;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_ESTRATO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_LUGAR_EXPEDICION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_LUGAR_NACIMIENTO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_NIVEL_ESTUDIOS;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_PROFESION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_SEXO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_TIPO_DOCUMENTO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.BTN_TIPO_VIVIENDA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.FILTRO_LUGARES;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.LST_LISTAS;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.LST_OPCIONES;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.LST_TIPO_DOCUMENTO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_ADULTOS;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_ANOS_RESIDENCIA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_BARRIO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_CELULAR;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_DIRECCION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_EMAIL;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_EPS;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_FECHA_EXPEDICION;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_FECHA_NACIMIENTO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_MENORES_18_ANOS;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_MESES_RESIDENCIA;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_PRIMER_APELLIDO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_PRIMER_NOMBRE;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_SEGUNDO_APELLIDO;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_SEGUNDO_NOMBRE;
import static co.com.red5g.userinterfaces.finsonet.FormularioSolicitudPaso2Page.TXT_TELEFONO_RESIDENCIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.interacions.Seleccionar;
import co.com.red5g.interacions.SeleccionarFecha;
import co.com.red5g.models.finsonet.InformacionPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class FormularioInformacionPersonal implements Task {
    private final InformacionPersonal informacionPersonal;

    public FormularioInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_PRIMER_APELLIDO, isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(informacionPersonal.getPrimerApellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(informacionPersonal.getSegundoApellido()).into(TXT_SEGUNDO_APELLIDO),
                Enter.theValue(informacionPersonal.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(informacionPersonal.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),
                Click.on(BTN_TIPO_DOCUMENTO),
                Click.on(LST_TIPO_DOCUMENTO.of(informacionPersonal.getTipoDocumento())),
                Click.on(BTN_LUGAR_EXPEDICION),
                Enter.theValue(informacionPersonal.getLugarExpedicion()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                SeleccionarFecha.deConsulta(
                        TXT_FECHA_EXPEDICION, informacionPersonal.getFechaExpedicion()),
                Click.on(BTN_SEXO),
                Click.on(LST_OPCIONES.of(informacionPersonal.getSexo())),
                SeleccionarFecha.deConsulta(TXT_FECHA_NACIMIENTO, informacionPersonal.getFechaNacimiento()),
                Click.on(BTN_LUGAR_NACIMIENTO),
                Enter.theValue(informacionPersonal.getLugarNacimiento()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                Click.on(BTN_ESTADO_CIVIL),
                Click.on(LST_OPCIONES.of(informacionPersonal.getEstadoCivil())),
                Click.on(BTN_CIUDAD_DEPARTAMENTO),
                Enter.theValue(informacionPersonal.getCiudadDepartamento()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                Click.on(BTN_TIPO_VIVIENDA),
                Click.on(LST_OPCIONES.of(informacionPersonal.getTipoVivienda())),
                Seleccionar.opcionLista(informacionPersonal.getEstrato(), BTN_ESTRATO, LST_LISTAS),
                Enter.theValue(informacionPersonal.getDireccion()).into(TXT_DIRECCION),
                Click.on(BTN_CERRAR_DIRECCION),
                Enter.theValue(informacionPersonal.getBarrio()).into(TXT_BARRIO),
                Enter.theValue(informacionPersonal.getTelefono()).into(TXT_TELEFONO_RESIDENCIA),
                Enter.theValue(informacionPersonal.getCelular()).into(TXT_CELULAR),
                Click.on(BTN_CORRESPONDENCIA),
                Click.on(LST_OPCIONES.of(informacionPersonal.getCorrepondencia())),
                Enter.theValue(informacionPersonal.getCorreoElectronico()).into(TXT_EMAIL),
                Enter.theValue(informacionPersonal.getTiempoResidenciaAnios()).into(TXT_ANOS_RESIDENCIA),
                Enter.theValue(informacionPersonal.getTiempoResidenciaMeses()).into(TXT_MESES_RESIDENCIA),
                Enter.theValue(informacionPersonal.getEps()).into(TXT_EPS),
                Enter.theValue(informacionPersonal.getAdultosCargo()).into(TXT_ADULTOS),
                Enter.theValue(informacionPersonal.getMenoresCargo()).into(TXT_MENORES_18_ANOS),
                Seleccionar.opcionLista(informacionPersonal.getNivelEstudios(), BTN_NIVEL_ESTUDIOS, LST_LISTAS),
                Seleccionar.opcionLista(informacionPersonal.getProfesion(), BTN_PROFESION, LST_LISTAS)
        );
    }
}
