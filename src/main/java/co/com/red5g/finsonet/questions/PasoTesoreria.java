package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA;

public class PasoTesoreria implements Question<Boolean> {
    private final static String TESORERIA = "Tesorería";
    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                Click.on(MNU_ORIGINACION.of(TESORERIA)));
        return LST_FILA_TESORERIA.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
