package co.com.red5g.finsonet.interacions;

import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AbreLaPagina implements Task {
    private LoginFinsonetPage loginFinsocialPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginFinsocialPage)
        );
    }

    public static Performable finsonet() {
        return instrumented(AbreLaPagina.class);
    }
}
