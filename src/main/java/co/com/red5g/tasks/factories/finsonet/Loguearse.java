package co.com.red5g.tasks.factories.finsonet;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.tasks.finsonet.Home;
import net.serenitybdd.screenplay.Performable;

public final class Loguearse {

    private Loguearse() {
    }

    public static Performable enFinsonet() {
        return instrumented(Home.class);
    }
}
