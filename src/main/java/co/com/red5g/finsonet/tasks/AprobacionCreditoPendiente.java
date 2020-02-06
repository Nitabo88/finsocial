package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.MNU_ACCION;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.TXT_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.AprobacionCredito;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionCreditoPendiente implements Task {

  private AprobacionCredito aprobacionCredito;
  private static final String PENDIENTE = "Pendiente";

  public AprobacionCreditoPendiente(AprobacionCredito aprobacionCredito) {
    this.aprobacionCredito = aprobacionCredito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    WebElementFacade fila =
        BTN_ACCION
            .of(actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO))
            .resolveFor(actor);
    if (!fila.isPresent()) {
      fila =
          BTN_ACCION
              .of(actor.recall(CEDULA_ACTOR), masUnMinuto(actor.recall(FECHA_SOLICITUD_CREDITO)))
              .resolveFor(actor);
    }
    actor.attemptsTo(
        JavaScriptClick.on(fila),
        JavaScriptClick.on(MNU_ACCION.of(PENDIENTE)),
        SelectFromOptions.byVisibleText(aprobacionCredito.getSeleccionMotivo()).from(LST_MOTIVO),
        Enter.theValue(aprobacionCredito.getRazonMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_ENVIAR),
        WaitUntil.the(BTN_OK,isVisible()).forNoMoreThan(20).seconds(),
        JavaScriptClick.on(BTN_OK));
  }
}
