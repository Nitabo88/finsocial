package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.*;
import static co.com.red5g.finsonet.utils.UtileriaFechas.formatearFechaServidorUTC;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Ingresa implements Task {
    private Credito credito;
    public static final String CEDULA_ACTOR = "cedula actor";
    public static final String FECHA_CREDITO = "fecha credito";

    public Ingresa(Credito credito) {
        this.credito = credito;
    }

    public static Performable diligenciar(Credito credito) {
        return instrumented(Ingresa.class, credito);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, credito.getStrNumeroDocumento());
        actor.attemptsTo(
                WaitUntil.the(TXT_DOCUMENTO, isCurrentlyEnabled()),
                Enter.theValue(credito.getStrNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
                WaitUntil.the(TBL_INFORMACION_CREDITOS, isPresent()).forNoMoreThan(3).seconds(),
                Enter.theValue(credito.getStrValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB),
                Enter.theValue(credito.getStrPlazo()).into(TXT_PLAZO),
                WaitUntil.the(BTN_CREAR_CREDITO, isCurrentlyEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BTN_CREAR_CREDITO),
                WaitUntil.the(FRM_EMERGENTE, isPresent()).forNoMoreThan(3).seconds(),
                Click.on(BTN_OK)
        );
        actor.remember(FECHA_CREDITO, formatearFechaServidorUTC());
    }
}