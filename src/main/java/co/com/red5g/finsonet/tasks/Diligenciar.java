package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Diligenciar implements Task {

    public static Performable laSolicitudDeCredito() {
        return instrumented(Diligenciar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
