package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LBL_POLITICAS_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_NOMBRE_APROBACION_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AprobacionDeCreditoLibranza implements Task {

  private static final String SALIR = "Salir";
  private static final String APROBACION_CREDITO = "Apr. de créditos";

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_MI_CUENTA),
        JavaScriptClick.on(MNM_MI_CUENTA.of(AprobacionDeCreditoLibranza.SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioDeAprobacionCreditos()),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(LNK_ORIGINACION),
        JavaScriptClick.on(MNM_ORIGINACION.of(AprobacionDeCreditoLibranza.APROBACION_CREDITO)),
        JavaScriptClick.on(LST_NOMBRE_APROBACION_LIBRANZA.of(numeroCredito)),
        WaitUntil.the(LBL_POLITICAS_CREDITO, isVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        JavaScriptClick.on(BTN_APROBAR),
        WaitUntil.the(BTN_OK, isVisible()).forNoMoreThan(TIEMPO_10).seconds(),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(BTN_OK)
    );
  }
}