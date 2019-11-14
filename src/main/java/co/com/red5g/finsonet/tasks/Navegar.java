package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_REPORTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    public static Performable alosReportesDeVenta() {
        return instrumented(Navegar.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_REPORTES));
    }
}
