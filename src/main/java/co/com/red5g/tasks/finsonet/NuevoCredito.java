package co.com.red5g.tasks.finsonet;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.userinterfaces.finsonet.ComercialPage.LNK_NUEVO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_COMERCIAL;

public class NuevoCredito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_COMERCIAL),
                Click.on(LNK_NUEVO_CREDITO));
    }
}