package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.*;
import static co.com.red5g.finsonet.utils.UtileriaFechas.formatearFechaServidorUTC;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class InformacionCredito implements Task {
    private final Credito credito;
    public static final String CEDULA_ACTOR = "cedula actor";
    public static final String FECHA_CREDITO = "fecha credito";

    public InformacionCredito(final Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.remember(InformacionCredito.CEDULA_ACTOR, this.credito.getNumeroDocumento());
        actor.remember(InformacionCredito.FECHA_CREDITO, formatearFechaServidorUTC());
        actor.attemptsTo(
                WaitUntil.the(TXT_DOCUMENTO, isCurrentlyEnabled()),
                Enter.theValue(this.credito.getNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
                WaitUntil.the(TBL_INFORMACION_CREDITOS, isPresent()).forNoMoreThan(3).seconds(),
                Enter.theValue(this.credito.getValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB),
                Enter.theValue(this.credito.getPlazo()).into(TXT_PLAZO),
                WaitUntil.the(BTN_CREAR_CREDITO, isCurrentlyEnabled()).forNoMoreThan(3).seconds(),
                Click.on(BTN_CREAR_CREDITO),
                WaitUntil.the(FRM_EMERGENTE, isPresent()).forNoMoreThan(3).seconds(),
                Click.on(BTN_OK)
        );
    }
}