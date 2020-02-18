package co.com.red5g.finsonet.interacions;


import co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage;
import co.com.red5g.finsonet.userinterfaces.VetadosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IngresaAContact implements Interaction {
    private EquipoSatisfaccionPage equipoSatisfaccionPage;


    public static Performable NuevaSolicitudContact() {
        return instrumented (IngresaAContact.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(equipoSatisfaccionPage)
        );
    }
}
