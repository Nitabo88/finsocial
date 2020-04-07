package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_INFORMACION_ADICIONAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LST_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_PLAZO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_VALOR_CUOTA;
import static co.com.red5g.finsonet.utils.UtileriaFechas.formatearFechaServidorUTC;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class InformacionCredito implements Task {
    private final Credito credito;
    public static final String CEDULA_ACTOR = "cedula actor";
    public static final String FECHA_CREDITO = "fecha credito";
    public static final int TIEMPO = 200;

    public InformacionCredito(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, credito.getNumeroDocumento());
        actor.remember(FECHA_CREDITO, formatearFechaServidorUTC());
        actor.attemptsTo(
            WaitUntil.the(TXT_DOCUMENTO, isVisible()),
            Enter.theValue(credito.getNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
            WaitUntil.the(LBL_INFORMACION_ADICIONAL, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Enter.theValue(credito.getValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB),
            Enter.theValue(credito.getPlazo()).into(TXT_PLAZO),
            SelectFromOptions.byVisibleText(credito.getCodigoPapeleria()).from(LST_PAPELERIA),
            WaitUntil.the(BTN_CREAR_CREDITO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_CREAR_CREDITO),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(BTN_OK)
        );
    }
}