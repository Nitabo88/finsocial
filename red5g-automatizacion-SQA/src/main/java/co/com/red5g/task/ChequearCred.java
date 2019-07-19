package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.ChequeoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChequearCred implements Task {

    private int cedula;

   public ChequearCred(int cedula) {
       this.cedula = cedula;    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EncontrarCedula.lacedula(cedula),
                Click.on(ChequeoPage.CHECK1),
                Click.on(ChequeoPage.CHECK2),
                Click.on(ChequeoPage.CHECK3),
                Click.on(ChequeoPage.CHECK4),
                Click.on(ChequeoPage.CHECK5),
                Click.on(ChequeoPage.CHECK6),
                Click.on(ChequeoPage.CHECK7),
                Click.on(ChequeoPage.CHECK8),
                Click.on(ChequeoPage.CHECK9),
                Click.on(ChequeoPage.CHECK10),
                Click.on(ChequeoPage.CHECK11),
                Click.on(ChequeoPage.CHECK12),
                Click.on(ChequeoPage.CHECK13),
                Click.on(ChequeoPage.CHECK14),
                Click.on(ChequeoPage.CHECK15),
                Click.on(ChequeoPage.BTN_GUARDAR),
                Click.on(ChequeoPage.BTN_REGISTRO));
        //driver.switchTo().alert().accept());

    }

    public static ChequearCred aprobacionChequeo(int cedula) {
        return instrumented(ChequearCred.class, cedula);
    }

}

