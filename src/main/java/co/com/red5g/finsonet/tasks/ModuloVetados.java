package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.interacions.IngresaAVetados;
import co.com.red5g.finsonet.models.builders.CredencialesBuilder;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.VetadosPage.BTN_NUEVO_VETO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ModuloVetados implements Task  {
    public static Performable ubicarseEnVetados() {
        return instrumented(ModuloVetados.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresaAVetados.NuevoVetados(),
                WaitUntil.the(BTN_NUEVO_VETO, isEnabled()));
    }
}
