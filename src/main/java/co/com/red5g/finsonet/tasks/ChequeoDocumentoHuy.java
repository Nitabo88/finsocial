package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.questions.ObtenerUrl.obtenerUrl;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.FECHA;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_COLUMNA_CHEQUEO_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChequeoDocumentoHuy implements Task {

  private static final int TIEMPO = 100;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.enNuevoCreditoHuy(),
        Ingresa.laInformacionDelCreditoHuy(la().informacionDelCreditoHuy()));
    String numeroCedula = actor.recall(CEDULA_ACTOR);
    String fecha = actor.recall(FECHA);
    actor.attemptsTo(
        Click.on(LST_COLUMNA_CHEQUEO_DOCUMENTO.of(numeroCedula,fecha).resolveAllFor(actor).get(0)));
    actor.remember(NUMERO_CREDITO, obtenerUrl().answeredBy(actor));
    actor.attemptsTo(
        Click.on(MNM_HAMBURGUESA),
        Click.on(IMG_FINSONET),
        WaitFor.seconds(5),
        Click.on(LNK_ORIGINACION));
  }
}
