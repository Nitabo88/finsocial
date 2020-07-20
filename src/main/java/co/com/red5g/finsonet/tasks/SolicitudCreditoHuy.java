package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.BTN_ERROR;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LBL_ID;
import static co.com.red5g.finsonet.userinterfaces.MisCreditosPage.LST_COLUMNA_CHEQUEO_DOCUMENTO;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.Constantes.FECHA;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;
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
        JavaScriptClick.on(BTN_ERROR),
        DoubleClick.on(LBL_ID)
    );
    String numeroCredito = LST_COLUMNA_CHEQUEO_DOCUMENTO.of(numeroCedula, fecha).resolveAllFor(actor).get(2).getText();
    actor.remember(NUMERO_CREDITO, numeroCredito);
  }
}
