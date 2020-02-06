package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.questions.SeleccionarColumna.FECHA;
import static co.com.red5g.finsonet.questions.SeleccionarColumna.seleccionarColumna;
import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_COLUMNAS_APROBACION_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_PERFIL_RIESGO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.models.AprobacionCredito;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Aprobar implements Task {

  private AprobacionCredito perfilRiesgo;

  public Aprobar(AprobacionCredito perfilRiesgo) {
    this.perfilRiesgo = perfilRiesgo;
  }

  public static Performable elCredito(AprobacionCredito perfilRiesgo) {
    return instrumented(Aprobar.class, perfilRiesgo);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String cedula = actor.recall(CEDULA_ACTOR);
    List<WebElementFacade> lstAprobacionCredito = seleccionarColumna(LST_COLUMNAS_APROBACION_CREDITO, cedula, actor.recall(FECHA_SOLICITUD_CREDITO)).answeredBy(actor);
    String nombre = lstAprobacionCredito.get(3).getText();
    actor.attemptsTo(
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of(cedula, actor.recall(FECHA), nombre)),
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(120).seconds(),
        SelectFromOptions.byVisibleText(perfilRiesgo.getPerfilRiesgo()).from(LST_PERFIL_RIESGO),
        JavaScriptClick.on(BTN_APROBAR)
    );
  }
}
