package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_MIS_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_FILA_CREDITO_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.TXT_BUSCAR;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CreditoLibranza implements Question<Boolean> {

    private static final String MIS_CREDITOS = "Mis créditos";

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(Ensure.that(LBL_MIS_CREDITOS.resolveFor(actor).getText()).isEqualTo(MIS_CREDITOS),
            Enter.theValue(numeroCredito).into(TXT_BUSCAR));
        return LST_FILA_CREDITO_LIBRANZA.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
