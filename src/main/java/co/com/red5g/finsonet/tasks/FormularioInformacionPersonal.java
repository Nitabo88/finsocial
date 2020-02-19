package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Seleccionar;
import co.com.red5g.finsonet.interacions.SeleccionarFecha;
import co.com.red5g.finsonet.models.InformacionPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso2Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormularioInformacionPersonal implements Task {
    private final InformacionPersonal informacionPersonal;

    public FormularioInformacionPersonal(final InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }



    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_PRIMER_APELLIDO, isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(this.informacionPersonal.getPrimerApellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(this.informacionPersonal.getSegundoApellido()).into(TXT_SEGUNDO_APELLIDO),
                Enter.theValue(this.informacionPersonal.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(this.informacionPersonal.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),
                Click.on(BTN_TIPO_DOCUMENTO),
                Click.on(LST_TIPO_DOCUMENTO.of(this.informacionPersonal.getTipoDocumento())),
                Click.on(BTN_LUGAR_EXPEDICION),
                Enter.theValue(this.informacionPersonal.getLugarExpedicion()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                SeleccionarFecha.ofConsult(
                        TXT_FECHA_EXPEDICION, this.informacionPersonal.getFechaExpedicion()),
                Click.on(BTN_SEXO),
                Click.on(LST_OPCIONES.of(this.informacionPersonal.getSexo())),
                SeleccionarFecha.ofConsult(TXT_FECHA_NACIMIENTO, this.informacionPersonal.getFechaNacimiento()),
                Click.on(BTN_LUGAR_NACIMIENTO),
                Enter.theValue(this.informacionPersonal.getLugarNacimiento()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                Click.on(BTN_ESTADO_CIVIL),
                Click.on(LST_OPCIONES.of(this.informacionPersonal.getEstadoCivil())),
                Click.on(BTN_CIUDAD_DEPARTAMENTO),
                Enter.theValue(this.informacionPersonal.getCiudadDepartamento()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                Click.on(BTN_TIPO_VIVIENDA),
                Click.on(LST_OPCIONES.of(this.informacionPersonal.getTipoVivienda())),
                Seleccionar.opcionLista(this.informacionPersonal.getEstrato(), BTN_ESTRATO, LST_LISTAS),
                Enter.theValue(this.informacionPersonal.getDireccion()).into(TXT_DIRECCION),
                Click.on(BTN_CERRAR_DIRECCION),
                Enter.theValue(this.informacionPersonal.getBarrio()).into(TXT_BARRIO),
                Enter.theValue(this.informacionPersonal.getTelefono()).into(TXT_TELEFONO_RESIDENCIA),
                Enter.theValue(this.informacionPersonal.getCelular()).into(TXT_CELULAR),
                Click.on(BTN_CORRESPONDENCIA),
                Click.on(LST_OPCIONES.of(this.informacionPersonal.getCorrepondencia())),
                Enter.theValue(this.informacionPersonal.getCorreoElectronico()).into(TXT_EMAIL),
                Enter.theValue(this.informacionPersonal.getTiempoResidenciaAnios()).into(TXT_ANOS_RESIDENCIA),
                Enter.theValue(this.informacionPersonal.getTiempoResidenciaMeses()).into(TXT_MESES_RESIDENCIA),
                Enter.theValue(this.informacionPersonal.getEps()).into(TXT_EPS),
                Enter.theValue(this.informacionPersonal.getAdultosCargo()).into(TXT_ADULTOS),
                Enter.theValue(this.informacionPersonal.getMenoresCargo()).into(TXT_MENORES_18_ANOS),
                Seleccionar.opcionLista(this.informacionPersonal.getNivelEstudios(), BTN_NIVEL_ESTUDIOS, LST_LISTAS),
                Seleccionar.opcionLista(this.informacionPersonal.getProfesion(), BTN_PROFESION, LST_LISTAS)
        );
    }
}
