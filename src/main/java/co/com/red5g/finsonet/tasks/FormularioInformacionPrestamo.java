package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.InformacionPrestamo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormularioInformacionPrestamo implements Task {
    private InformacionPrestamo informacionPrestamo;

    public FormularioInformacionPrestamo(InformacionPrestamo informacionPrestamo) {
        this.informacionPrestamo = informacionPrestamo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacionPrestamo.getStrMonto()).into(TXT_MONTO),
                Enter.theValue(informacionPrestamo.getStrCuota()).into(TXT_CUOTA),
                Enter.theValue(informacionPrestamo.getStrPlazo()).into(TXT_PLAZO),
                Enter.theValue(informacionPrestamo.getStrTasaInteres()).into(TXT_TASA_INTERES),
                Enter.theValue(informacionPrestamo.getStrTasaMora()).into(TXT_TASA_MORA),
                Enter.theValue(informacionPrestamo.getStrTasaMaximaInteresVigente()).into(TXT_TASA_MAXIMA_VIGENTE)
        );
    }
}
