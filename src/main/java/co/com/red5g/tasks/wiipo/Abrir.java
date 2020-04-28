package co.com.red5g.tasks.wiipo;

import co.com.red5g.userinterfaces.wiipo.LoginWiipoPage;
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
