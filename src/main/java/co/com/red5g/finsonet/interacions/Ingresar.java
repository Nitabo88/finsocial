package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_COLUMNA_FORMULARIO_SOLICITUD;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.TXT_BUSCAR;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Interaction {

    public static Performable enFormularioDeSolicitud() {
        return instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Enter.theValue(numeroCredito).into(TXT_BUSCAR),
            Click.on(LST_COLUMNA_FORMULARIO_SOLICITUD.of(numeroCredito)));
    }
}