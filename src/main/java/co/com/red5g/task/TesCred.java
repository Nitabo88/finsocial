package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.TesoreriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TesCred implements Task {

    int cedula;

    public TesCred(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                EncontrarCedula.lacedula(cedula),
                Click.on(TesoreriaPage.guardar(cedula)));
    }

    public static TesCred tesCred(int cedula) {
        return instrumented(TesCred.class, cedula);

    }
}
