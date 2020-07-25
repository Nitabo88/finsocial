package co.com.red5g.finsonet.tasks;

import static co.com.red5g.general.interactions.CambiarPestanaActual.cambiarPestanaActual;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR_ACCION_HUY;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR_HUY;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_FORMULARIO_SOLICITUD;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_GUARDAR_DATOS;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.factories.Subir;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class InformacionChequeoDocumentoHuy implements Task {

  private static final String SALIR = "Salir";
  private ChequeoDocumento chequeoDocumento;

  public InformacionChequeoDocumentoHuy(ChequeoDocumento chequeoDocumento) {
    this.chequeoDocumento = chequeoDocumento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroCedula = actor.recall(CEDULA_ACTOR);
    actor.attemptsTo(
        MoveMouse.to(LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY.of(numeroCredito)),
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY.of(numeroCredito)),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
        Click.on(BTN_ACEPTAR_HUY),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_ACEPTAR_ACCION_HUY),
        WaitFor.seconds(TIEMPO_3),
        Subir.losArchivosDeChequeoDocumentosHuy(),
        Click.on(BTN_CERRAR_POP_UP),
        Click.on(BTN_FORMULARIO_SOLICITUD),
        cambiarPestanaActual(),
        Diligencia.laSolicitudDeCreditoBackEnd(de().unUsuarioAdministrador(), con().informacionCredihuy(), numeroCedula),
        cerrarPestana(),
        WaitUntil.the(BTN_GUARDAR_DATOS, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        JavaScriptClick.on(BTN_GUARDAR_DATOS),
        WaitFor.seconds(TIEMPO_3),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        Click.on(BTN_OK),
        Click.on(BTN_MI_CUENTA),
        Click.on(MNM_MI_CUENTA.of(SALIR)),
        Loguearse.enFinsonet(),
        WaitFor.seconds(TIEMPO_3),
        Click.on(LNK_ORIGINACION)
    );
  }
}
