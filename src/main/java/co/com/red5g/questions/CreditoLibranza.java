package co.com.red5g.questions;

import static co.com.red5g.tasks.finsonet.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.tasks.finsonet.InformacionCreditoLibranza.FECHA;
import static co.com.red5g.userinterfaces.finsonet.MisCreditosPage.LST_FILA_CREDITO_LIBRANZA;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class CreditoLibranza implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        String fecha = actor.recall(FECHA);
        List<WebElementFacade> lstFila = LST_FILA_CREDITO_LIBRANZA.of(numeroCedula, fecha).resolveAllFor(actor);
        actor.attemptsTo(MoveMouse.to(lstFila.get(0)));
        return lstFila.get(0).isPresent();
    }
}
