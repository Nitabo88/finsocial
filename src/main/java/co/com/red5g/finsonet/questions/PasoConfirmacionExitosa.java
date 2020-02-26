package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.LST_FILA_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoConfirmacionExitosa implements Question<Boolean> {

    public static final String CONFIRMACION = "Confirmación";
    private static final int TIEMPO = 10;

    @Override
    public Boolean answeredBy(final Actor actor) {
        final String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(MNU_ORIGINACION.of(PasoConfirmacionExitosa.CONFIRMACION)),
            WaitUntil.the(LST_FILA_CONFIRMACION.of(numeroCredito), isEnabled()).forNoMoreThan(PasoConfirmacionExitosa.TIEMPO).seconds());
        return LST_FILA_CONFIRMACION.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
