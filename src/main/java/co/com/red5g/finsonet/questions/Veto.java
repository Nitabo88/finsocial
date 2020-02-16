package co.com.red5g.finsonet.questions;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.InformacionVeto.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCredito.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.VerificarVetoPage.LST_FILA_VETOS;

public class Veto implements Question<Boolean> {
    private Vetados vetados;

    public Veto(Vetados vetados) {
        this.vetados = vetados;
    }

    public static Veto existe(Vetados vetados) {
        return new Veto(vetados);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Target lstFila = LST_FILA_VETOS.of(vetados.getDocumentoVetados());
        return lstFila.resolveFor(actor).isPresent();
    }
}
