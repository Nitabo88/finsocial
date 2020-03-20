package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.CHK_ID_LLAMADAS;

public class ValidarLlamada implements Question<Boolean> {

    public static ValidarLlamada estaConfirmada() {
        return new ValidarLlamada();
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);

        final Target lstFila = CHK_ID_LLAMADAS.of(numeroCredito);
        return lstFila.resolveFor(actor).isDisabled();
    }
}
