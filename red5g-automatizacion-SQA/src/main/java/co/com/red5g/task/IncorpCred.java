package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.ConfirmPage;
import co.com.red5g.userinterfaces.IncorporacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IncorpCred implements Task {

    private int cedula;

    public IncorpCred(int cedula) {
        this.cedula = cedula;    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                EncontrarCedula.lacedula(cedula),
                Click.on(IncorporacionPage.COMBO_ANIO),
                Click.on(IncorporacionPage.COMBO_MES),
                Click.on(IncorporacionPage.BTN_APROBAR));
    }

    public static IncorpCred aprobacionIncorp(int cedula) {
        return instrumented(IncorpCred.class, cedula);
    }

}







