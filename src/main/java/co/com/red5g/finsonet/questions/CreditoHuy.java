package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.util.List;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_HUY;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.Constantes.FECHA;

public class CreditoHuy implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String fechaCredito = actor.recall(FECHA);
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        List<WebElementFacade> lstFila = LST_FILA_CREDITO_HUY.of(numeroCedula,fechaCredito).resolveAllFor(actor);
        actor.attemptsTo(MoveMouse.to(lstFila.get(0)));
        return lstFila.get(0).isPresent();
    }
}
