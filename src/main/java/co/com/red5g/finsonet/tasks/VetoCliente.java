package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class VetoCliente implements Task {

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Loguearse.enFinsonet(),
                ModuloVetados.ubicarseEnVetados()
        );
    }
}
