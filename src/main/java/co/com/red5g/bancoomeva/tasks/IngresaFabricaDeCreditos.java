package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LBL_MENSAJE_DASHBOARD;
import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LNK_OFICINA;
import static co.com.red5g.bancoomeva.userinterfaces.OficinaPage.LBL_OFICINA;
import static co.com.red5g.bancoomeva.userinterfaces.OficinaPage.LNK_FABRICA_CREDITOS;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.bancoomeva.modelos.Credenciales;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

public class IngresaFabricaDeCreditos implements Task {

  private static final String OFICINA = "Banca Express + / Oficina";
  Credenciales credenciales;

  public IngresaFabricaDeCreditos(Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Diligencia.lasCredencialesDeAutenticacion(credenciales),
        Ensure.that(LBL_MENSAJE_DASHBOARD).isEnabled(),
        Click.on(LNK_OFICINA),
        WaitFor.seconds(TIEMPO_3));
    actor.attemptsTo(
        Ensure.that(LBL_OFICINA.resolveFor(actor).getText()).contains(OFICINA),
        Click.on(LNK_FABRICA_CREDITOS)
    );
  }
}
