package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AntecarteraPage.LST_FILA_ANTECARTERA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;

public class AntecarteraLibranza implements Question<Boolean> {

    private static final String ANTECARTERA = "Antecartera";

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                Click.on(MNM_HAMBURGUESA),
                Click.on(MNM_NUEVO_ORIGINACION.of(ANTECARTERA)),
                MoveMouse.to(LST_FILA_ANTECARTERA.of(numeroCredito))
        );
        return LST_FILA_ANTECARTERA.of(numeroCredito).resolveFor(actor).isPresent();
    }
}