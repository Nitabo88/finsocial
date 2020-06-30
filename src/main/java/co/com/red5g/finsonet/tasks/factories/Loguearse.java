package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.Home;
import co.com.red5g.finsonet.tasks.LoginBackEnd;
import co.com.red5g.finsonet.models.Credenciales;
import net.serenitybdd.screenplay.Performable;

public final class Loguearse {

    private Loguearse() {
    }

    public static Performable enFinsonet() {
        return instrumented(Home.class);
    }

    public static Performable enFinsonetBack(Credenciales credenciales) {
        return instrumented(LoginBackEnd.class, credenciales);
    }
}
