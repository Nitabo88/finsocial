package co.com.red5g.interacions;

import co.com.red5g.userinterfaces.finsonet.VetadosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresaAVetados implements Interaction {
    private VetadosPage vetadosPage;

    public static Performable nuevoVetados() {
        return instrumented (IngresaAVetados.class);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Open.browserOn(this.vetadosPage)
        );
    }
}
