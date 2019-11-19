package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Prestamo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso1Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Escribir implements Task {
    private Prestamo prestamo;

    public Escribir(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public static Performable laInformacionDelPrestamo(Prestamo informacionPrestamo) {
        return instrumented(Escribir.class, informacionPrestamo);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(prestamo.getStrMonto()).into(TXT_MONTO),
                Enter.theValue(prestamo.getStrCuota()).into(TXT_CUOTA),
                Enter.theValue(prestamo.getStrPlazo()).into(TXT_PLAZO),
                Enter.theValue(prestamo.getStrTasaInteres()).into(TXT_TASA_INTERES),
                Enter.theValue(prestamo.getStrTasaMora()).into(TXT_TASA_MORA),
                Enter.theValue(prestamo.getStrTasaMaximaInteresVigente()).into(TXT_TASA_MAXIMA_VIGENTE)
        );
    }
}
