package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.SeleccionarFecha;
import co.com.red5g.finsonet.models.InformacionConyugue;
import co.com.red5g.finsonet.models.InformacionPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso5Page.*;

public class FormularioInformacionConyugue implements Task {
    private final InformacionPersonal informacionPersonal;
    private final InformacionConyugue informacionConyugue;

    public FormularioInformacionConyugue(InformacionPersonal informacionPersonal, InformacionConyugue informacionConyugue) {
        this.informacionPersonal = informacionPersonal;
        this.informacionConyugue = informacionConyugue;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacionPersonal.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(informacionPersonal.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),
                Enter.theValue(informacionPersonal.getPrimerApellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(informacionPersonal.getSegundoApellido()).into(TXT_SEGUNDO_APELLIDO),
                Click.on(BTN_TIPO_DOCUMENTO),
                Click.on(LST_FILTROS.of(informacionPersonal.getTipoDocumento())),
                Enter.theValue(informacionPersonal.getNumeroDocumento()).into(TXT_DOCUMENTO_IDENTIDAD),
                SeleccionarFecha.deConsulta(TXT_FECHA_EXPEDICION, informacionPersonal.getFechaExpedicion()),
                Click.on(BTN_LUGAR_EXPEDICION),
                Enter.theValue(informacionPersonal.getLugarExpedicion()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                SeleccionarFecha.deConsulta(TXT_FECHA_NACIMIENTO, informacionPersonal.getFechaNacimiento()),
                Click.on(BTN_LUGAR_NACIMIENTO),
                Enter.theValue(informacionPersonal.getLugarNacimiento()).into(FILTRO_LUGAR_NACIMIENTO).thenHit(Keys.ENTER),
                Click.on(BTN_SEXO),
                Click.on(LST_FILTROS.of(informacionPersonal.getSexo())),
                Enter.theValue(informacionConyugue.getLugarDondeTrabaja()).into(TXT_LUGAR_TRABAJO),
                Click.on(RBN_OCUPACION.of(informacionConyugue.getOcupacion())),
                Click.on(RBN_DEPENDENCIA_ECONOMICA.of(informacionConyugue.getDependenciaEconomica())),
                SeleccionarFecha.deConsulta(TXT_FECHA_INGRESO, informacionConyugue.getFechaIngreso()),
                Enter.theValue(informacionConyugue.getCargoActual()).into(TXT_CARGO_ACTUAL),
                Enter.theValue(informacionConyugue.getTotalIngresos()).into(TXT_TOTAL_INGRESOS),
                Enter.theValue(informacionConyugue.getTotalEgresos()).into(TXT_TOTAL_EGRESOS),
                Enter.theValue(informacionPersonal.getEps()).into(TXT_NOMBRE_EPS),
                Enter.theValue(informacionPersonal.getCelular()).into(TXT_CELULAR),
                SelectFromOptions.byVisibleText(informacionPersonal.getNivelEstudios()).from(LST_NIVEL_ESTUDIOS)
        );
    }
}
