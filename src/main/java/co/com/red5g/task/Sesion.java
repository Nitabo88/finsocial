package co.com.red5g.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static co.com.red5g.userinterfaces.FinsocialPage.FINSOCIAL_HOME_PAGE;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Sesion implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(FINSOCIAL_HOME_PAGE));
               }

    public static Performable sesion() {return instrumented(Sesion.class);
    }
}
