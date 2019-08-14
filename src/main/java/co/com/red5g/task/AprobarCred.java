package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.AprobacionPage;
import co.com.red5g.userinterfaces.ConfirmPage;
import cucumber.api.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AprobarCred implements Task {

    private int cedula;

    public AprobarCred(int cedula) {
        this.cedula = cedula;    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(AprobacionPage.encontrar(cedula)),
                JavaScriptClick.on(AprobacionPage.BTN_APROBAR));
    }

    public static AprobarCred aprobacionCred(int cedula) {
        return instrumented(AprobarCred.class, cedula);
    }

}

