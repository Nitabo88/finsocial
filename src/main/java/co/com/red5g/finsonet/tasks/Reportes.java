package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.models.builders.CredencialesBuilder;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_REPORTES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Reportes implements Task {

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                Ingresa.lasCredenciales(CredencialesBuilder.de().unUsuarioBasico()),
                WaitUntil.the(LNK_REPORTES, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(LNK_REPORTES)
        );
    }
}