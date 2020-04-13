package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_LIBRANZA;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class CreditoLibranza implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade lstFila = seleccionarFila(LST_FILA_CREDITO_LIBRANZA,actor.recall(CEDULA_ACTOR),actor.recall(FECHA_CREDITO)).answeredBy(actor);
        actor.attemptsTo(MoveMouse.to(lstFila));
        return lstFila.isPresent();
    }
}
