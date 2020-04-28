package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.interacions.finsonet.CerrarPestana.cerrarPestana;
import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR_ACCION_HUY;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR_HUY;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_CERRAR_POP_UP;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_FORMULARIO_SOLICITUD;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_GUARDAR_DATOS;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.interacions.factories.Subir;
import co.com.red5g.models.finsonet.ChequeoDocumento;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class InformacionChequeoDocumentoHuy implements Task {

  private static final int TIEMPO = 20;
  private ChequeoDocumento chequeoDocumento;

  public InformacionChequeoDocumentoHuy(ChequeoDocumento chequeoDocumento) {
    this.chequeoDocumento = chequeoDocumento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        MoveMouse.to(LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY.of(numeroCredito)),
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY.of(numeroCredito)),
        Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
        Click.on(BTN_ACEPTAR_HUY),
        Click.on(BTN_ACEPTAR_ACCION_HUY),
        WaitFor.seconds(2),
        Subir.losArchivosDeChequeoDocumentosHuy(),
        Click.on(BTN_CERRAR_POP_UP),
        JavaScriptClick.on(BTN_FORMULARIO_SOLICITUD),
        cambiarPestanaActual(),
        Diligencia.laSolicitudDeCredito(),
        cerrarPestana(),
        WaitUntil.the(BTN_GUARDAR_DATOS, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_GUARDAR_DATOS),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(BTN_OK));
  }
}
