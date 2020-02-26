package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.InformacionPrestamo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.*;

public class FormularioInformacionPrestamo implements Task {
    private final InformacionPrestamo informacionPrestamo;

    public FormularioInformacionPrestamo(final InformacionPrestamo informacionPrestamo) {
        this.informacionPrestamo = informacionPrestamo;
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Enter.theValue(this.informacionPrestamo.getStrMonto()).into(TXT_MONTO),
                Enter.theValue(this.informacionPrestamo.getStrCuota()).into(TXT_CUOTA),
                Enter.theValue(this.informacionPrestamo.getStrPlazo()).into(TXT_PLAZO),
                Enter.theValue(this.informacionPrestamo.getStrTasaInteres()).into(TXT_TASA_INTERES),
                Enter.theValue(this.informacionPrestamo.getStrTasaMora()).into(TXT_TASA_MORA),
                Enter.theValue(this.informacionPrestamo.getStrTasaMaximaInteresVigente()).into(TXT_TASA_MAXIMA_VIGENTE)
        );
    }
}
