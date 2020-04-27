package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.MNM_BUSQUEDA_PQR;
import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.MNM_PQR;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_EQUIPO_SATISFACCION;

public class ContactCenter implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_EQUIPO_SATISFACCION),
                Click.on(MNM_PQR),
                Click.on(MNM_BUSQUEDA_PQR));
    }
}
