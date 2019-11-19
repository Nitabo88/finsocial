package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.InformacionPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso2Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EscribirLaInformacion implements Task {
    private InformacionPersonal informacionPersonal;

    public EscribirLaInformacion(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }


    public static Performable personal(InformacionPersonal informacionPersonal) {
        return instrumented(EscribirLaInformacion.class, informacionPersonal);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_PRIMER_APELLIDO,isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(informacionPersonal.getPrimerApellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(informacionPersonal.getSegundoApellido()).into(TXT_SEGUNDO_APELLIDO),
                Enter.theValue(informacionPersonal.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(informacionPersonal.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),
                Click.on(BTN_TIPO_DOCUMENTO),
                Click.on(LST_TIPO_DOCUMENTO.of(informacionPersonal.getTipoDocumento())),
                Enter.theValue(informacionPersonal.getDireccion()).into(TXT_DIRECCION),
                Click.on(BTN_CERRAR_DIRECCION),
                Enter.theValue(informacionPersonal.getBarrio()).into(TXT_BARRIO),
                Enter.theValue(informacionPersonal.getTelefono()).into(TXT_TELEFONO_RESIDENCIA),
                Enter.theValue(informacionPersonal.getCelular()).into(TXT_CELULAR),
                Enter.theValue(informacionPersonal.getCorreoElectronico()).into(TXT_EMAIL),
                Enter.theValue(informacionPersonal.getTiempoResidenciaAnios()).into(TXT_ANOS_RESIDENCIA),
                Enter.theValue(informacionPersonal.getTiempoResidenciaMeses()).into(TXT_MESES_RESIDENCIA),
                Enter.theValue(informacionPersonal.getAdultosCargo()).into(TXT_ADULTOS),
                Enter.theValue(informacionPersonal.getMenoresCargo()).into(TXT_MENORES_18_ANOS)
        );
    }
}
