package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ComercialPage.LNK_MIS_CREDITOS;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.LBL_INFORMACION_ADICIONAL;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.LST_PAPELERIA;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.TXT_PLAZO;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.TXT_VALOR_CUOTA;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_HAMBURGUESA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.utils.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class InformacionCreditoLibranza implements Task {

    private final Credito credito;
    public static final String FECHA = "fecha credito";
    public static final String CEDULA_ACTOR = "cedula actor";
    public static final int TIEMPO = 100;

    public InformacionCreditoLibranza(Credito credito) {
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
            Click.on(BTN_OK),
            Click.on(MNM_HAMBURGUESA),
            Click.on(IMG_FINSONET),
            Click.on(LNK_COMERCIAL),
            Click.on(LNK_MIS_CREDITOS)
        );
    }
}