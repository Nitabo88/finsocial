package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Eliminar implements Task {

    public Eliminar() {
    }

    public static Eliminar elVeto() {
        return instrumented(Eliminar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Loguearse.enFinsonet());
    }
}
