package co.com.red5g.finsonet.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.*;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ContactCenter implements Task {

    public static Performable ubicarseEnContactCenter() {
        return instrumented(ContactCenter.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_EQUIPO_SATISFACCION),
                Click.on(MNU_PQR),
                Click.on(MNU_BUSQUEDA_PQR));
    }
}
