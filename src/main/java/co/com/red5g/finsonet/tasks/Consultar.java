package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Abrir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_REPORTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Consultar implements Task {

    public static Performable unReporte() {
        return instrumented(Consultar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Abrir.laPaginaPrincipal(),
                Ingresar.lasCredenciales(de().unUsuarioBasico()),
                WaitUntil.the(LNK_REPORTES,isEnabled()),
                Click.on(LNK_REPORTES)
        );
    }
}
