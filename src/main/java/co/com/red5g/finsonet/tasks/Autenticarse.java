package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticarse implements Task {

    public static Performable enFinsonet() {
        return instrumented(Autenticarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                SeAutentica.conCredenciales(de().unUsuarioBasico())
        );
    }
}
