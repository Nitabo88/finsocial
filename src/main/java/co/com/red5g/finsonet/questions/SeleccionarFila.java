package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

public class SeleccionarFila implements Question<WebElementFacade> {
    Target lstFila;
    String primerParametro;
    String segundoParametro;

    private SeleccionarFila(final Target lstFila, final String primerParametro, final String segundoParametro) {
        this.lstFila = lstFila;
        this.primerParametro = primerParametro;
        this.segundoParametro = segundoParametro;
    }

    public static SeleccionarFila seleccionarFila(final Target lstFila, final String primerParametro, final String segundoParametro) {
        return new SeleccionarFila(lstFila, primerParametro, segundoParametro);
    }

    @Override
    public WebElementFacade answeredBy(final Actor actor) {
       WebElementFacade lstFilaCompleta = this.lstFila.of(this.primerParametro, this.segundoParametro).resolveFor(actor);
        if (!lstFilaCompleta.isPresent()) {
            lstFilaCompleta = this.lstFila.of(this.primerParametro, masUnMinuto(this.segundoParametro)).resolveFor(actor);
        }
        return lstFilaCompleta;
    }
}
