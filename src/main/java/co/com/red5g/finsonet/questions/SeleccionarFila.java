package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public final class SeleccionarFila implements Question<WebElementFacade> {
    final Target lstFila;
    final String primerParametro;
    final String segundoParametro;

    private SeleccionarFila(Target lstFila, String primerParametro, String segundoParametro) {
        this.lstFila = lstFila;
        this.primerParametro = primerParametro;
        this.segundoParametro = segundoParametro;
    }

    public static SeleccionarFila seleccionarFila(Target lstFila, String primerParametro, String segundoParametro) {
        return new SeleccionarFila(lstFila, primerParametro, segundoParametro);
    }

    @Override
    public WebElementFacade answeredBy(Actor actor) {
       WebElementFacade lstFilaCompleta = lstFila.of(primerParametro, segundoParametro).resolveFor(actor);
        if (!lstFilaCompleta.isPresent()) {
            lstFilaCompleta = lstFila.of(primerParametro, masUnMinuto(segundoParametro)).resolveFor(actor);
        }
        return lstFilaCompleta;
    }
}
