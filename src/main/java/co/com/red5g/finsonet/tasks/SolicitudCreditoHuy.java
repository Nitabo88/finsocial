package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCreditoHuy.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCreditoHuy.FECHA;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_COLUMNA_CHEQUEO_DOCUMENTO;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.questions.ObtenerUrl;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class SolicitudCreditoHuy implements Task {

  private final Credito credito;

  public SolicitudCreditoHuy(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.enNuevoCreditoHuy(),
        Ingresa.laInformacionDelCreditoHuy(credito));
    String numeroCedula = actor.recall(CEDULA_ACTOR);
    String fecha = actor.recall(FECHA);
    actor.attemptsTo(
        JavaScriptClick.on(LST_COLUMNA_CHEQUEO_DOCUMENTO.of(numeroCedula, fecha).resolveAllFor(actor).get(0)));
    actor.remember(NUMERO_CREDITO, ObtenerUrl.obtenerUrl().answeredBy(actor));
  }
}
