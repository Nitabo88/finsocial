package co.com.red5g.wiipo.tasks;

import co.com.red5g.wiipo.userinterfaces.LoginWiipoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {
    LoginWiipoPage loginWiipoPage;

    public static Performable wiipo() {
        return instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginWiipoPage)
        );
    }
}
