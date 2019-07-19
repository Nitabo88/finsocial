package co.com.red5g.Interaction;

import co.com.red5g.userinterfaces.TesoreriaPage;
import cucumber.api.java.bs.I;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EncontrarCedula implements Interaction {

   int cedula;


    @Override
    public <T extends Actor> void performAs(T actor) {

     actor.attemptsTo(
             Click.on(TesoreriaPage.XPATH));


    }


    public static EncontrarCedula lacedula(int cedula) {
        return instrumented(EncontrarCedula.class, cedula);
    }
}
