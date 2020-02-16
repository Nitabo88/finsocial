package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.CHK_ID_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_LLAMADAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Llamada implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Loguearse.enFinsonet(),
                WaitUntil.the(LNK_LLAMADAS,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LNK_LLAMADAS));
    }
}
