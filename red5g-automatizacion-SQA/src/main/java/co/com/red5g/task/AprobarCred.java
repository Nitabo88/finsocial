package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.AprobacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AprobarCred implements Task {

    private int cedula;

    public AprobarCred(int cedula) {
        this.cedula = cedula;    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        EncontrarCedula.lacedula(cedula),
        Click.on(AprobacionPage.BTN_APROBAR));
    }

    public static AprobarCred aprobacionCred(int cedula) {
        return instrumented(AprobarCred.class, cedula);
    }

}

