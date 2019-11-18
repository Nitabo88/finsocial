package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class Comercial implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        WaitUntil.the(LNK_COMERCIAL,isCurrentlyEnabled()),
        Click.on(LNK_COMERCIAL)
        );
    }
}