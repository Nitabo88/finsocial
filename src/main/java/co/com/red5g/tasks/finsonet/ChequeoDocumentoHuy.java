package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.MisCreditosPage.LST_COLUMNA_CHEQUEO_DOCUMENTO;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_HAMBURGUESA;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import co.com.red5g.questions.finsonet.ObtenerUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class ChequeoDocumentoHuy implements Task {

  private Credito credito;

  public ChequeoDocumentoHuy(Credito credito) {
    this.credito = credito;
  }

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
        Click.on(MNM_HAMBURGUESA),
        Click.on(IMG_FINSONET),
        WaitFor.seconds(3),
        Click.on(LNK_ORIGINACION));
  }
}
