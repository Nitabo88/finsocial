package co.com.red5g.finsonet.questions;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.CdasPage.*;
import static co.com.red5g.finsonet.userinterfaces.IncorporacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_CDAS;

public class RechazoAprobacionCreditoHuy implements Question<String> {
    private static final String ID_CREDITO = "ID crédito";

    @Override
    public String answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                Click.on(MNM_HAMBURGUESA),
                Click.on(IMG_FINSONET),
                MoveMouse.to(LNK_CDAS),
                Click.on(LNK_CDAS));
        actor.attemptsTo(
                JavaScriptClick.on(RDB_CRITERIO_BUSQUEDA.of(ID_CREDITO)),
                Enter.theValue(numeroCredito).into(TXT_VALOR_BUSQUEDA),
                Click.on(BTN_BUSQUEDA),
                WaitFor.seconds(2)
        );
        return LBL_ESTADO_ACTUAL.of(numeroCredito).resolveFor(actor).getTextContent();
    }
}
