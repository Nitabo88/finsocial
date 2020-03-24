package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.BTN_ACCION;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.FRM_REQUISITOS_GIRO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class ValidarLlamada implements Question<String> {

    private static final String LLAMADA = "Llamada";

    public static ValidarLlamada estaConfirmada() {
        return new ValidarLlamada();
    }

    @Override
    public String answeredBy(final Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(BTN_ACCION.of(numeroCredito))
        );
        return FRM_REQUISITOS_GIRO.of(LLAMADA).resolveFor(actor).getText();
    }
}
