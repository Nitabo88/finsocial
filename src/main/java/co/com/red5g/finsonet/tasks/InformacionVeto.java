package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class InformacionVeto implements Task {
    private Vetados vetados;
    public static final String CEDULA_ACTOR = "cedula actor";

    public InformacionVeto(Vetados vetados) {
        this.vetados = vetados;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, vetados.getDocumentoVetados());
    }
}
