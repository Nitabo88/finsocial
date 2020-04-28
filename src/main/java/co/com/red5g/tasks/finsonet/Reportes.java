package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_REPORTES;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.interacions.AbreLaPagina;
import co.com.red5g.models.builders.finsonet.CredencialesBuilder;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Reportes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            AbreLaPagina.finsonet(),
            Ingresa.lasCredenciales(CredencialesBuilder.de().unUsuarioBasico()),
            WaitFor.seconds(2),
            Click.on(LNK_REPORTES)
        );
    }
}