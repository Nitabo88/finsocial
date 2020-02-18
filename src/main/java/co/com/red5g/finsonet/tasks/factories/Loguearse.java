package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.tasks.Home;
import net.serenitybdd.screenplay.Performable;

public class Loguearse {

    private Loguearse() {
    }

    public static Performable enFinsonet() {
        return instrumented(Home.class);
    }
}
