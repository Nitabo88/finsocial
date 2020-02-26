package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.*;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Intenta implements Task {

    public static Performable crearUnCredito() {
        return instrumented(Intenta.class);
    }
    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(IMG_FINSONET),
                Ubicarse.enNuevoCredito(),
                Enter.theValue("10040048").into(TXT_DOCUMENTO).thenHit(Keys.ENTER)
        );
    }
}
