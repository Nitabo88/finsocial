package co.com.red5g.Interaction;

import co.com.red5g.userinterfaces.TesoreriaPage;
import cucumber.api.java.bs.I;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;


public class EncontrarCedula implements Interaction {

   int cedula;

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(WaitUntil.the(TesoreriaPage.BTN_GUARDAR,isCurrentlyVisible()));
}
    public static EncontrarCedula lacedula(int cedula) {
        return instrumented(EncontrarCedula.class, cedula);
    }
}
