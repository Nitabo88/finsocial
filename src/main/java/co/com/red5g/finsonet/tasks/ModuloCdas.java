package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_CDAS;

public class ModuloCdas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ubicarse.enElFormulario(),
                Diligencia.laSolicitudDeCredito(),
                Click.on(IMG_FINSONET),
                Click.on(LNK_CDAS)
        );
    }
}
