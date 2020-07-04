package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_MIS_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_INFORMACION_ADICIONAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LST_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_PLAZO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_VALOR_CUOTA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.Constantes.FECHA;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.utils.string.UtileriaFechas;
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
            WaitUntil.the(LBL_INFORMACION_ADICIONAL, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            Enter.theValue(credito.getValorCuota()).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB),
            MoveMouse.to(TXT_PLAZO),
            Enter.theValue(credito.getPlazo()).into(TXT_PLAZO),
            SelectFromOptions.byVisibleText(credito.getCodigoPapeleria()).from(LST_PAPELERIA),
            WaitUntil.the(BTN_CREAR_CREDITO, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
            MoveMouse.to(BTN_CREAR_CREDITO),
            Click.on(BTN_CREAR_CREDITO),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_OK),
            WaitFor.seconds(TIEMPO_3),
            Click.on(MNM_HAMBURGUESA),
            Click.on(IMG_FINSONET),
            Click.on(LNK_COMERCIAL),
            Click.on(LNK_MIS_CREDITOS)
        );
    }
}