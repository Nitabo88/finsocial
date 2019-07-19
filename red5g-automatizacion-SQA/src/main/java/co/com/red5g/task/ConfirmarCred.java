package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ConfirmarCred implements Task {

    private int cedula;

    public ConfirmarCred(int cedula) {
        this.cedula = cedula;    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                EncontrarCedula.lacedula(cedula),
                Click.on(ConfirmPage.BTN_ACCION),
                Click.on(ConfirmPage.BTN_CONFIRMAR),
                Click.on(ConfirmPage.BTN_ACEPTAR));
    }

    public static ConfirmarCred aprobacionConfirm(int cedula) {
        return instrumented(ConfirmarCred.class, cedula);
    }

    }

