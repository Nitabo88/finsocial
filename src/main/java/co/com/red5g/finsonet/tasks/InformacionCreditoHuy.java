package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA;
import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_MIS_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_INFORMACION_ADICIONAL;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_PLAZO;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.utils.UtileriaFechas.formatearFechaServidorUTC;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class InformacionCreditoHuy implements Task {

  private static final int TIEMPO = 200;
  private final Credito credito;

  public InformacionCreditoHuy(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.remember(InformacionCreditoLibranza.CEDULA_ACTOR, credito.getNumeroDocumento());
    actor.remember(FECHA, formatearFechaServidorUTC());
    actor.attemptsTo(
        Enter.theValue(credito.getNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
        WaitUntil.the(LBL_INFORMACION_ADICIONAL, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Enter.theValue(credito.getPlazo()).into(TXT_PLAZO),
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
