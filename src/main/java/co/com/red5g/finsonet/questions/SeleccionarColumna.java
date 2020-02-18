package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

public class SeleccionarColumna implements Question<List<WebElementFacade>> {
    public static final String FECHA = "fecha";
    Target lstFila;
    String primerParametro;
    String segundoParametro;

    private SeleccionarColumna(final Target lstFila, final String primerParametro, final String segundoParametro) {
        this.lstFila = lstFila;
        this.primerParametro = primerParametro;
        this.segundoParametro = segundoParametro;
    }

    public static SeleccionarColumna seleccionarColumna(final Target lstFila, final String primerParametro, final String segundoParametro) {
        return new SeleccionarColumna(lstFila, primerParametro, segundoParametro);
    }

    @Override
    public List<WebElementFacade> answeredBy(final Actor actor) {
        List<WebElementFacade> lstFilaCompleta = this.lstFila.of(this.primerParametro, this.segundoParametro).resolveAllFor(actor);
        actor.remember(SeleccionarColumna.FECHA, this.segundoParametro);
        if (lstFilaCompleta.isEmpty()) {
            lstFilaCompleta = this.lstFila.of(this.primerParametro, masUnMinuto(this.segundoParametro)).resolveAllFor(actor);
            actor.remember(SeleccionarColumna.FECHA, masUnMinuto(this.segundoParametro));
        }
        return lstFilaCompleta;
    }
}
