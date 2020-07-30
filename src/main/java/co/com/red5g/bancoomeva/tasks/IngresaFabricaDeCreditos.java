package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.LoginBancaExpress.ingresarEnBancaExpress;
import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LNK_OFICINA;
import static co.com.red5g.bancoomeva.userinterfaces.OficinaPage.LNK_FABRICA_CREDITOS;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaFabricaDeCreditos implements Task {

  Credenciales credenciales;

  public IngresaFabricaDeCreditos(Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ingresarEnBancaExpress(credenciales),
        Click.on(LNK_OFICINA),
        Click.on(LNK_FABRICA_CREDITOS)
    );
  }
}
