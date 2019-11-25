package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.models.builder.CredencialesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_REPORTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ConsultaUnReporte implements Task {

    public static Performable de() {
        return instrumented(ConsultaUnReporte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AbreLaPagina.finsonet(),
                SeAutentica.conCredenciales(CredencialesBuilder.de().unUsuarioBasico()),
                WaitUntil.the(LNK_REPORTES,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LNK_REPORTES)
        );
    }
}