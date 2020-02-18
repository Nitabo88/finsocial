package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class EquipoSatisfaccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Loguearse.enFinsonet(),
                ContactCenter.ubicarseEnContactCenter()
        );
    }
}
