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

    public FormularioInformacionConyugue(final InformacionPersonal informacionPersonal, final InformacionConyugue informacionConyugue) {
        this.informacionPersonal = informacionPersonal;
        this.informacionConyugue = informacionConyugue;
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Enter.theValue(this.informacionPersonal.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(this.informacionPersonal.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),
                Enter.theValue(this.informacionPersonal.getPrimerApellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(this.informacionPersonal.getSegundoApellido()).into(TXT_SEGUNDO_APELLIDO),
                Click.on(BTN_TIPO_DOCUMENTO),
                Click.on(LST_FILTROS.of(this.informacionPersonal.getTipoDocumento())),
                Enter.theValue(this.informacionPersonal.getNumeroDocumento()).into(TXT_DOCUMENTO_IDENTIDAD),
                SeleccionarFecha.ofConsult(TXT_FECHA_EXPEDICION, this.informacionPersonal.getFechaExpedicion()),
                Click.on(BTN_LUGAR_EXPEDICION),
                Enter.theValue(this.informacionPersonal.getLugarExpedicion()).into(FILTRO_LUGARES).thenHit(Keys.ENTER),
                SeleccionarFecha.ofConsult(TXT_FECHA_NACIMIENTO, this.informacionPersonal.getFechaNacimiento()),
                Click.on(BTN_LUGAR_NACIMIENTO),
                Enter.theValue(this.informacionPersonal.getLugarNacimiento()).into(FILTRO_LUGAR_NACIMIENTO).thenHit(Keys.ENTER),
                Click.on(BTN_SEXO),
                Click.on(LST_FILTROS.of(this.informacionPersonal.getSexo())),
                Enter.theValue(this.informacionConyugue.getLugarDondeTrabaja()).into(TXT_LUGAR_TRABAJO),
                Click.on(RBN_OCUPACION.of(this.informacionConyugue.getOcupacion())),
                Click.on(RBN_DEPENDENCIA_ECONOMICA.of(this.informacionConyugue.getDependenciaEconomica())),
                SeleccionarFecha.ofConsult(TXT_FECHA_INGRESO, this.informacionConyugue.getFechaIngreso()),
                Enter.theValue(this.informacionConyugue.getCargoActual()).into(TXT_CARGO_ACTUAL),
                Enter.theValue(this.informacionConyugue.getTotalIngresos()).into(TXT_TOTAL_INGRESOS),
                Enter.theValue(this.informacionConyugue.getTotalEgresos()).into(TXT_TOTAL_EGRESOS),
                Enter.theValue(this.informacionPersonal.getEps()).into(TXT_NOMBRE_EPS),
                Enter.theValue(this.informacionPersonal.getCelular()).into(TXT_CELULAR),
                SelectFromOptions.byVisibleText(this.informacionPersonal.getNivelEstudios()).from(LST_NIVEL_ESTUDIOS)
        );
    }
}
