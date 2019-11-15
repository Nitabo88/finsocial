package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.models.builder.CreditoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Ingresa implements Task {
    private Credito credito;

    public Ingresa(Credito credito) {
        this.credito = credito;
    }

    public static Performable Diligenciar(CreditoBuilder creditoBuilder) {
        return instrumented(Ingresa.class, creditoBuilder.build());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_DOCUMENTO, isCurrentlyEnabled()),
                Enter.theValue(credito.getStrNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
                WaitUntil.the(TBL_INFORMACION_CREDITOS, isPresent()),
                Enter.theValue(credito.getStrValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB)
        );
        actor.attemptsTo(
                Enter.theValue(credito.getStrPlazo()).into(TXT_PLAZO),
                WaitUntil.the(BTN_CREAR_CREDITO, isCurrentlyEnabled()),
                Click.on(BTN_CREAR_CREDITO),
                WaitUntil.the(FRM_EMERGENTE, isPresent()),
                Click.on(BTN_OK)
        );
    }
}