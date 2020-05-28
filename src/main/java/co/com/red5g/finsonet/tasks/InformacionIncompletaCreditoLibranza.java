package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.utils.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InformacionIncompletaCreditoLibranza implements Task {

    private final Credito credito;
    public static final String FECHA = "fecha credito";
    public static final String CEDULA_ACTOR = "cedula actor";
    public static final int TIEMPO = 100;

    public InformacionIncompletaCreditoLibranza(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, credito.getNumeroDocumento());
        actor.remember(FECHA, UtileriaFechas.formatearFechaServidorUTC());
        actor.attemptsTo(
                WaitUntil.the(TXT_DOCUMENTO, isVisible()),
                Enter.theValue(credito.getNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
                WaitUntil.the(LBL_INFORMACION_ADICIONAL, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Enter.theValue(credito.getValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB),
                MoveMouse.to(TXT_PLAZO),
                Enter.theValue(credito.getPlazo()).into(TXT_PLAZO),
                SelectFromOptions.byVisibleText(credito.getCodigoPapeleria()).from(LST_PAPELERIA),
                WaitUntil.the(BTN_CREAR_CREDITO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                MoveMouse.to(BTN_CREAR_CREDITO),
                Click.on(BTN_CREAR_CREDITO),
                WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK));
    }
}
