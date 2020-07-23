package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID2;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_LIBRANZA;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.Constantes.FECHA;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class CreditoLibranza implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        String fechaCredito = actor.recall(FECHA);
        actor.attemptsTo(
            Click.on(LBL_ID),
            Click.on(LBL_ID2)
        );
        List<WebElementFacade> lstFila = LST_FILA_CREDITO_LIBRANZA.of(numeroCedula, fechaCredito).resolveAllFor(actor);
        actor.attemptsTo(MoveMouse.to(lstFila.get(0)));
        return lstFila.get(0).isPresent();
    }
}
