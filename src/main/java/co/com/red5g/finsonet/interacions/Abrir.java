package co.com.red5g.finsonet.interacions;

import co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Abrir implements Task {
    private LoginFinsocialPage loginFinsocialPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginFinsocialPage)
        );
    }

    public static Performable laPaginaPrincipal() {
        return instrumented(Abrir.class);
    }
}
