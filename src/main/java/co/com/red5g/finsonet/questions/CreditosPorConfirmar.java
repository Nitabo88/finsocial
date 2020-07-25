package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_CREDITOS_POR_CONFIRMAR;
import static co.com.red5g.finsonet.userinterfaces.CreditosPorConfirmarPage.LST_FILA_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CreditosPorConfirmar implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(WaitUntil.the(MNM_HAMBURGUESA, isPresent()).forNoMoreThan(TIEMPO_60).seconds(),
            Click.on(MNM_HAMBURGUESA),
            Click.on(IMG_FINSONET),
            Click.on(LNK_COMERCIAL),
            Click.on(LNK_CREDITOS_POR_CONFIRMAR),
            Scroll.to(LST_FILA_CREDITOS.of(numeroCredito)));
        return LST_FILA_CREDITOS.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
