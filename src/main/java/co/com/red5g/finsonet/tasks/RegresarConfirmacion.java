package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_ACCION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.MNU_ACCION;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.TXT_MOTIVO;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;

import co.com.red5g.finsonet.models.Confirmacion;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class RegresarConfirmacion implements Task {

  private Confirmacion confirmacion;

  private static final String REGRESAR = "Regresar";

  public RegresarConfirmacion(Confirmacion confirmacion) {
    this.confirmacion = confirmacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    WebElementFacade fila = BTN_ACCION.of(actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO)).resolveFor(actor);
    if (!fila.isPresent()) {
      fila = BTN_ACCION.of(actor.recall(CEDULA_ACTOR), masUnMinuto(actor.recall(FECHA_SOLICITUD_CREDITO))).resolveFor(actor);
    }
    actor.attemptsTo(
        JavaScriptClick.on(fila),
        JavaScriptClick.on(MNU_ACCION.of(REGRESAR)),
        Enter.theValue(confirmacion.getRazonMotivo()).into(TXT_MOTIVO),
        JavaScriptClick.on(BTN_OK),
        JavaScriptClick.on(BTN_OK));
  }
}
