package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_INFORMACION_ADICIONAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LST_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_EMAIL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_PLAZO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_VALOR_CUOTA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class InformacionIncompletaCreditoLibranza implements Task {

    private final Credito credito;

    public InformacionIncompletaCreditoLibranza(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(CEDULA_ACTOR, credito.getNumeroDocumento());
        actor.attemptsTo(
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            WaitUntil.the(TXT_DOCUMENTO, isVisible()),
            Enter.theValue(credito.getNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
            WaitUntil.the(LBL_INFORMACION_ADICIONAL, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Clear.field(TXT_EMAIL),
            Enter.theValue(credito.getValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB),
            MoveMouse.to(TXT_PLAZO),
            Enter.theValue(credito.getPlazo()).into(TXT_PLAZO),
            SelectFromOptions.byVisibleText(credito.getCodigoPapeleria()).from(LST_PAPELERIA),
            WaitUntil.the(BTN_CREAR_CREDITO, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
            MoveMouse.to(BTN_CREAR_CREDITO),
            Click.on(BTN_CREAR_CREDITO),
            WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
            Click.on(BTN_OK));
    }
}
