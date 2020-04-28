package co.com.red5g.questions;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ConfirmacionPage.LST_FILA_CONFIRMACION;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoConfirmacionExitosa implements Question<Boolean> {

    public static final String CONFIRMACION = "Confirmación";
    private static final int TIEMPO = 10;

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(MNM_ORIGINACION.of(CONFIRMACION)),
            WaitUntil.the(LST_FILA_CONFIRMACION.of(numeroCredito), isEnabled()).forNoMoreThan(TIEMPO).seconds());
        return LST_FILA_CONFIRMACION.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
