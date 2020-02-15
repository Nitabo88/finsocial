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

    private SeleccionarColumna(Target lstFila, String primerParametro, String segundoParametro) {
        this.lstFila = lstFila;
        this.primerParametro = primerParametro;
        this.segundoParametro = segundoParametro;
    }

    public static SeleccionarColumna seleccionarColumna(Target lstFila, String primerParametro, String segundoParametro) {
        return new SeleccionarColumna(lstFila, primerParametro, segundoParametro);
    }

    @Override
    public List<WebElementFacade> answeredBy(Actor actor) {
        List<WebElementFacade> lstFilaCompleta = lstFila.of(primerParametro, segundoParametro).resolveAllFor(actor);
        actor.remember(FECHA, segundoParametro);
        if (lstFilaCompleta.isEmpty()) {
            lstFilaCompleta = lstFila.of(primerParametro, masUnMinuto(segundoParametro)).resolveAllFor(actor);
            actor.remember(FECHA, masUnMinuto(segundoParametro));
        }
        return lstFilaCompleta;
    }
}
