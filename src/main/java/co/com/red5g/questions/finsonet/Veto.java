package co.com.red5g.questions.finsonet;

import co.com.red5g.models.finsonet.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.userinterfaces.finsonet.VetadosPage.LST_FILA_VETOS;

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
