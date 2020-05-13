package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;

public class TesoreriaFinsoamigo implements Task {
    private static final String TESORERIA = "Tesorería";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Loguearse.enFinsonet(),
                Click.on(LNK_ORIGINACION),
                Click.on(MNM_ORIGINACION.of(TESORERIA)));
    }
}
