package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PasoTesoreria implements Question<Boolean> {

    private static final String TESORERIA = "Tesorería";
    private static final int TIEMPO = 100;

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(MNU_ORIGINACION.of(TESORERIA)),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds());
        return LST_FILA_TESORERIA.of(numeroCredito).resolveFor(actor).isPresent();
    }
}

