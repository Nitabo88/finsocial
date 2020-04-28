package co.com.red5g.tasks.finsonet;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.models.builders.finsonet.CredencialesBuilder.de;
import static co.com.red5g.userinterfaces.finsonet.AprobacionCreditoPage.*;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.*;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

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
            WaitFor.seconds(2),
            JavaScriptClick.on(LNK_ORIGINACION),
            JavaScriptClick.on(MNM_ORIGINACION.of(APROBACION_CREDITO)),
            MoveMouse.to(LST_NOMBRE_APROBACION_CREDITO_HUY.of(numeroCredito)),
            Click.on(LST_NOMBRE_APROBACION_CREDITO_HUY.of(numeroCredito)),
            Click.on(BTN_APROBAR),
            Click.on(BTN_OK)
    );
  }
}
