package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Eliminar implements Task {
    private Vetados vetados;

    public Eliminar(Vetados vetados) {
        this.vetados = vetados;
    }

    public static Eliminar elVeto(Vetados vetados) {
        return instrumented(Eliminar.class, vetados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Loguearse.enFinsonet());
    }
}
