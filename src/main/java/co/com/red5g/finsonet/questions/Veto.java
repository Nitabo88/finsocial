package co.com.red5g.finsonet.questions;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.userinterfaces.VetadosPage.LST_FILA_VETOS;

public class Veto implements Question<Boolean> {
    private final Vetados vetados;

    public Veto(final Vetados vetados) {
        this.vetados = vetados;
    }

    public static Veto existe(final Vetados vetados) {
        return new Veto(vetados);
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        final Target lstFila = LST_FILA_VETOS.of(this.vetados.getDocumentoVetados());
        return lstFila.resolveFor(actor).isPresent();
    }
}
