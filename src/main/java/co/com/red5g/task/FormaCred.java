package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.FormalizacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormaCred implements Task {

    int cedula;

    public FormaCred (int cedula){
        this.cedula= cedula;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EncontrarCedula.lacedula(cedula),
                Click.on(FormalizacionPage.BTN_GUARDAR)

        );
  }

    public static FormaCred formaCred(int cedula) {
        return instrumented(FormaCred.class, cedula);
    }
}
