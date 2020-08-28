package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_NUEVO_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.finsonet.userinterfaces.TesoreriaPage.LST_FILA_TESORERIA_HUY;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TesoreriaCrediHuy implements Question<Boolean> {

    private static final String TESORERIA = "Tesorería";

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Click.on(MNM_NUEVO_ORIGINACION.of(TESORERIA)),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds(),
            Scroll.to(LST_FILA_TESORERIA_HUY.of(numeroCredito)).andAlignToBottom());
        return LST_FILA_TESORERIA_HUY.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
