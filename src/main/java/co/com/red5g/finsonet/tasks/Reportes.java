package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_REPORTES;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.models.builders.CredencialesBuilder;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Reportes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            AbreLaPagina.finsonet(),
            Ingresa.lasCredenciales(CredencialesBuilder.de().unUsuarioBasico()),
            WaitFor.seconds(TIEMPO_3),
            Click.on(LNK_REPORTES)
        );
    }
}