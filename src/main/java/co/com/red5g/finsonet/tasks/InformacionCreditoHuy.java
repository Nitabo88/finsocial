package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.TXT_PLAZO;
import static co.com.red5g.finsonet.utils.UtileriaFechas.formatearFechaServidorUTC;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class InformacionCreditoHuy implements Task {

  private Credito credito;

  public InformacionCreditoHuy(final Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(InformacionCredito.CEDULA_ACTOR, this.credito.getNumeroDocumento());
    actor.remember(InformacionCredito.FECHA_CREDITO, formatearFechaServidorUTC());
    actor.attemptsTo(
        Enter.theValue(this.credito.getNumeroDocumento()).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
        Enter.theValue(this.credito.getPlazo()).into(TXT_PLAZO),
        JavaScriptClick.on(BTN_CREAR_CREDITO),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(10).seconds(),
        JavaScriptClick.on(BTN_OK)
    );
  }
}
