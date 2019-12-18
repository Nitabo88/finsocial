package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Credenciales implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                Ingresa.lasCredenciales(de().unUsuarioBasico())
        );
    }
}