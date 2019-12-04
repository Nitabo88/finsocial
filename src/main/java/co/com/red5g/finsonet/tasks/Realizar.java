package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Realizar implements Task {

    public static Performable unChequeoDeDocumento() {
        return instrumented(Realizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ubicarse.enElFormulario(),
                Diligenciar.laSolicitudDeCredito(),
                cambiarPestana(),
                Click.on(LNK_HOME),
                WaitUntil.the(LNK_ORIGINACION,isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(LNK_ORIGINACION)
        );
    }
}
