package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.MenuEquipoSatisfaccionPage.MNM_PQR;
import static co.com.red5g.finsonet.userinterfaces.MenuEquipoSatisfaccionPage.MNM_SUBMENU_PQR;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_EQUIPO_SATISFACCION;

public class ContactCenter implements Task {
    private static final String BUSQUEDA_PQR = "Búsqueda PQRS";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_EQUIPO_SATISFACCION),
                Click.on(MNM_PQR),
                Click.on(MNM_SUBMENU_PQR.of(BUSQUEDA_PQR)));
    }
}
