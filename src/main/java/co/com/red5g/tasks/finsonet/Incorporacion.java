package co.com.red5g.tasks.finsonet;

import static co.com.red5g.models.builders.finsonet.CredencialesBuilder.de;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class Incorporacion implements Task {

  private static final String SALIR = "Salir";
  private static final String MNM_INCORPORACION = "Incorporación";

  private Credito credito;

  public Incorporacion(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditos(credito),
        Diligencia.laInformacionDeAprobacionDeCredito(),
        JavaScriptClick.on(BTN_MI_CUENTA),
        JavaScriptClick.on(MNM_MI_CUENTA.of(Incorporacion.SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioBasico()),
        WaitFor.seconds(3),
        JavaScriptClick.on(LNK_ORIGINACION),
        Click.on(MNM_ORIGINACION.of(MNM_INCORPORACION))
    );
  }
}