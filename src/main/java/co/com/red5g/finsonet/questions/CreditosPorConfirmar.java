package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_CREDITOS_POR_CONFIRMAR;
import static co.com.red5g.finsonet.userinterfaces.CreditosPorConfirmarPage.LST_FILA_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;

public class CreditosPorConfirmar implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                Click.on(MNM_HAMBURGUESA),
                Click.on(IMG_FINSONET),
                Click.on(LNK_COMERCIAL),
                Click.on(LNK_CREDITOS_POR_CONFIRMAR),
                MoveMouse.to(LST_FILA_CREDITOS.of(numeroCredito))
        );
        return LST_FILA_CREDITOS.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
