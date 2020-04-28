package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.models.builders.finsonet.CredencialesBuilder.de;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionDeCreditoLibranza implements Task {

  private static final String SALIR = "Salir";
  private static final String APROBACION_CREDITO = "Apr. de créditos";
  private static final int TIEMPO = 120;

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_MI_CUENTA),
        JavaScriptClick.on(MNM_MI_CUENTA.of(AprobacionDeCreditoLibranza.SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioDeAprobacionCreditos()),
        WaitFor.seconds(2),
        JavaScriptClick.on(LNK_ORIGINACION),
        JavaScriptClick.on(MNM_ORIGINACION.of(AprobacionDeCreditoLibranza.APROBACION_CREDITO)),
        JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA.of(numeroCredito)),
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
        JavaScriptClick.on(BTN_APROBAR),
        WaitUntil.the(BTN_OK, isVisible()),
        JavaScriptClick.on(BTN_OK)
    );
  }
}