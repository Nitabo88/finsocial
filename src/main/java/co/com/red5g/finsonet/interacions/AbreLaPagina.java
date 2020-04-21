package co.com.red5g.finsonet.interacions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class AbreLaPagina implements Task {

    private LoginFinsonetPage loginFinsocialPage;

    public AbreLaPagina(LoginFinsonetPage loginFinsocialPage) {
        this.loginFinsocialPage = loginFinsocialPage;
    }

    public static Performable finsonet() {
        return instrumented(AbreLaPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn(loginFinsocialPage)
        );
    }
}