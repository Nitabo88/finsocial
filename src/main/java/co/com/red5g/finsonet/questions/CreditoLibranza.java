package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_LIBRANZA;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class CreditoLibranza implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        String fechaCredito = actor.recall(FECHA);
        List<WebElementFacade> lstFila = LST_FILA_CREDITO_LIBRANZA.of(numeroCedula, fechaCredito).resolveAllFor(actor);
        actor.attemptsTo(MoveMouse.to(lstFila.get(0)));
        return lstFila.get(0).isPresent();
    }
}
