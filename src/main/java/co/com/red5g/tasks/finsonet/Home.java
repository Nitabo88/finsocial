package co.com.red5g.tasks.finsonet;

import co.com.red5g.interacions.AbreLaPagina;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.red5g.models.builders.finsonet.CredencialesBuilder.de;

public class Home implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                Ingresa.lasCredenciales(de().unUsuarioBasico())
        );
    }
}