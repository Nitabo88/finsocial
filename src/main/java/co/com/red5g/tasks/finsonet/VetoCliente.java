package co.com.red5g.tasks.finsonet;

import co.com.red5g.tasks.factories.finsonet.Loguearse;
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
