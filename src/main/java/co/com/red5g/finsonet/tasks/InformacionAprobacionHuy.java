package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_APROBAR;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.AprobacionCreditoPage.LST_NOMBRE_APROBACION_CREDITO_HUY;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class InformacionAprobacionHuy implements Task {

  private static final String SALIR = "Salir";
  private static final String APROBACION_CREDITO = "Apr. de créditos";

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        JavaScriptClick.on(BTN_MI_CUENTA),
        JavaScriptClick.on(MNM_MI_CUENTA.of(SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioDeAprobacionCreditos()),
        WaitFor.seconds(TIEMPO_3),
        JavaScriptClick.on(LNK_ORIGINACION),
        JavaScriptClick.on(MNM_ORIGINACION.of(APROBACION_CREDITO)),
        MoveMouse.to(LST_NOMBRE_APROBACION_CREDITO_HUY.of(numeroCredito)),
        Click.on(LST_NOMBRE_APROBACION_CREDITO_HUY.of(numeroCredito)),
        Click.on(BTN_APROBAR),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_OK)
    );
  }
}
