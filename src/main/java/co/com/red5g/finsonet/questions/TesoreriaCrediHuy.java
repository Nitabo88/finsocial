package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_HUY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class TesoreriaCrediHuy implements Question<Boolean> {

    private static final String TESORERIA = "Tesorería";
    private static final int TIEMPO = 100;

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                Click.on(MNM_ORIGINACION.of(TESORERIA)),
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LST_FILA_TESORERIA_HUY.of(numeroCredito)));
        return LST_FILA_TESORERIA_HUY.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
