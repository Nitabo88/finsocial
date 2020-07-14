package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.HomePage.BTN_INGRESAR;
import static co.com.red5g.bancoomeva.userinterfaces.HomePage.BTN_SOY_COLABORADOR;
import static co.com.red5g.bancoomeva.userinterfaces.HomePage.TXT_CONTRASENA;
import static co.com.red5g.bancoomeva.userinterfaces.HomePage.TXT_USUARIO;

import co.com.red5g.bancoomeva.modelos.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Autenticacion implements Task {

  private Credenciales credenciales;

  public Autenticacion(Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_SOY_COLABORADOR),
        Enter.theValue(credenciales.getUsuario()).into(TXT_USUARIO),
        Enter.theValue(credenciales.getContrasena()).into(TXT_CONTRASENA),
        Click.on(BTN_INGRESAR));
  }
}
