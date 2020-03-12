package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Vetados;
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

public class IntentaCrear implements Task {
    private Vetados vetados;

    public static Performable unCredito() {
        return instrumented(IntentaCrear.class);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Enter.theValue(vetados.getDocumentoVetados()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER)
        );
    }
}
