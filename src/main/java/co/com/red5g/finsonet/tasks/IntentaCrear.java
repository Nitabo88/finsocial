package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_NUEVO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_NOMBRE_COMPLETO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class IntentaCrear implements Task {

    private static final int TIEMPO = 60;
    private final Vetados vetados;

    public IntentaCrear(Vetados vetados) {
        this.vetados = vetados;
    }

    public static Performable unCredito(Vetados vetados) {
        return instrumented(IntentaCrear.class, vetados);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
            Click.on(IMG_FINSONET),
            Click.on(LNK_COMERCIAL),
            Click.on(LNK_NUEVO_CREDITO),
            Enter.theValue(vetados.getDocumentoVetados()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
            WaitUntil.the(TXT_NOMBRE_COMPLETO, isVisible()).forNoMoreThan(TIEMPO).seconds()
        );
    }
}
