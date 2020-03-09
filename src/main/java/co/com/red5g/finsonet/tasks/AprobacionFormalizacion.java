package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.*;

public class AprobacionFormalizacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                JavaScriptClick.on(LST_COLUMNA_NOMBRE_FORMALIZACION.of(numeroCredito)),
                JavaScriptClick.on(BTN_GUARDAR_DATOS),
                JavaScriptClick.on(BTN_OK)
        );
    }
}