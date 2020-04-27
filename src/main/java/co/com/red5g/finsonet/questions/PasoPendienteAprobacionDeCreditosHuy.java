package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_PENDIENTE_APROBACION_CREDIHUY;

public class PasoPendienteAprobacionDeCreditosHuy implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(MoveMouse.to(LST_PENDIENTE_APROBACION_CREDIHUY.of(numeroCredito)));
        return LST_PENDIENTE_APROBACION_CREDIHUY.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
