package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AntecarteraPage.LST_FILA_ANTECARTERA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AntecarteraLibranza implements Question<Boolean> {

    private static final String ANTECARTERA = "Antecartera";
    private static final int TIEMPO = 120;

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                JavaScriptClick.on(MNM_HAMBURGUESA),
                JavaScriptClick.on(MNM_NUEVO_ORIGINACION.of(ANTECARTERA)),
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(LST_FILA_ANTECARTERA.of(numeroCredito))
        );
        return LST_FILA_ANTECARTERA.of(numeroCredito).resolveFor(actor).isPresent();
    }
}