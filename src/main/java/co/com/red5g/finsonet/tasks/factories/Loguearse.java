package co.com.red5g.finsonet.tasks.factories;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loguearse {

    public static Performable enFinsonet() {
        return instrumented(co.com.red5g.finsonet.tasks.Credenciales.class);
    }
}
