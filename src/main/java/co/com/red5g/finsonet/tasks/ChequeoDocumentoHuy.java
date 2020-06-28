package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_COLUMNA_CHEQUEO_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.utils.data.Constantes.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.questions.ObtenerUrl;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class ChequeoDocumentoHuy implements Task {

  private Credito credito;

  public ChequeoDocumentoHuy(Credito credito) {
    this.credito = credito;
  }

  private static final String SALIR = "Salir";

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.enNuevoCreditoHuy(),
        Ingresa.laInformacionDelCreditoHuy(credito));
    String numeroCedula = actor.recall(InformacionCreditoLibranza.CEDULA_ACTOR);
    String fecha = actor.recall(InformacionCreditoLibranza.FECHA);
    actor.attemptsTo(
        JavaScriptClick.on(LST_COLUMNA_CHEQUEO_DOCUMENTO.of(numeroCedula, fecha).resolveAllFor(actor).get(0)));
    actor.remember(NUMERO_CREDITO, ObtenerUrl.obtenerUrl().answeredBy(actor));
    actor.attemptsTo(
        Diligencia.laSolicitudDeCreditoBackEnd(de().unUsuarioAdministrador(), con().informacionCredihuy(), credito),
        Click.on(BTN_MI_CUENTA),
        Click.on(MNM_MI_CUENTA.of(SALIR)),
        Loguearse.enFinsonet(),
        WaitFor.seconds(TIEMPO_3),
        Click.on(LNK_ORIGINACION));
  }
}
