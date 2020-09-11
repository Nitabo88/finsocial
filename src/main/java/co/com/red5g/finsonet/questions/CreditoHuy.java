package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID2;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_HUY;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.Constantes.FECHA;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CreditoHuy implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String fechaCredito = actor.recall(FECHA);
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        actor.attemptsTo(
            Click.on(LBL_ID),
            Click.on(LBL_ID2)
        );
        actor.attemptsTo(WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds());
        List<WebElementFacade> lstFila = LST_FILA_CREDITO_HUY.of(numeroCedula, fechaCredito).resolveAllFor(actor);
        actor.attemptsTo(Scroll.to(lstFila.get(0)).andAlignToBottom());
        return lstFila.get(0).isPresent();
    }
}
