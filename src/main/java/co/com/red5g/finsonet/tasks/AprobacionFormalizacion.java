package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.factories.Subir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.interacions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.finsonet.interacions.CerrarPestana.cerrarPestana;
import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AprobacionFormalizacion implements Task {
    private static final int TIEMPO = 150;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                WaitUntil.the(LBL_FORMALIZACION, isPresent()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(LST_COLUMNA_NOMBRE_FORMALIZACION.of(numeroCredito)),
                Click.on(BTN_SUBIR_DOCUMENTOS),
                cambiarPestanaActual(),
                Subir.losArchivosDeFormalizacion(),
                cerrarPestana(),
                cambiarPestana(),
                Click.on(BTN_GUARDAR_DATOS),
                WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_OK)
        );
    }
}