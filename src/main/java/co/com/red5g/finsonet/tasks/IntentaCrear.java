package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_NUEVO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET_NEW;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.Vetados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class IntentaCrear implements Task {

    private Vetados vetados;

    private static final int TIEMPO = 5;

    public IntentaCrear(Vetados vetados) {
        this.vetados = vetados;
    }

    public static Performable unCredito() {
        return instrumented(IntentaCrear.class);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(IMG_FINSONET_NEW),
                Click.on(LNK_COMERCIAL),
                Click.on(LNK_NUEVO_CREDITO),
                Enter.theValue(vetados.getDocumentoVetados()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER)
        );
    }
}
