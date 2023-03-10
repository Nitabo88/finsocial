package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.VetadosPage.BTN_NUEVO_VETO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.red5g.finsonet.interacions.IngresaAVetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ModuloVetados implements Task  {
    public static Performable ubicarseEnVetados() {
        return instrumented(ModuloVetados.class);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                IngresaAVetados.nuevoVetados(),
                WaitUntil.the(BTN_NUEVO_VETO, isEnabled()));
    }
}
