package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNU_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Incorporacion implements Task {

  private static final String SALIR = "Salir";
  private static final String INCORPORACION = "Incorporación";
  private static final int TIEMPO = 10;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditos(),
        Diligencia.laInformacionDeAprobacionDeCredito(),
        JavaScriptClick.on(BTN_MI_CUENTA),
        JavaScriptClick.on(MNU_MI_CUENTA.of(Incorporacion.SALIR)),
        Ingresa.lasCredenciales(de().unUsuarioBasico()),
        WaitUntil.the(LNK_ORIGINACION, isVisible()).forNoMoreThan(Incorporacion.TIEMPO).seconds(),
        JavaScriptClick.on(LNK_ORIGINACION),
        Click.on(MNU_ORIGINACION.of(INCORPORACION))
    );
  }
}