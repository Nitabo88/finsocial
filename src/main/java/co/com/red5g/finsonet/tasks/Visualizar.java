package co.com.red5g.finsonet.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Visualizar implements Task {
    private final Target lnkReporte;

    public Visualizar(Target lnkReporte) {
        this.lnkReporte = lnkReporte;
    }

    public static Performable elReporte(Target lnkReporte) {
        return instrumented(Visualizar.class,lnkReporte);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(lnkReporte)
        );
    }
}
