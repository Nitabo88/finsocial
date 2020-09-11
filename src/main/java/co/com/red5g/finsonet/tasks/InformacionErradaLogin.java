package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.BTN_ENVIAR;
import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.TXT_CONTRASENA;
import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.TXT_USUARIO;

import co.com.red5g.finsonet.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InformacionErradaLogin implements Task {

  private final Credenciales credenciales;

  public InformacionErradaLogin(final Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(this.credenciales.getUsuario()).into(TXT_USUARIO),
        Enter.theValue(this.credenciales.getContrasena()).into(TXT_CONTRASENA),
        Click.on(BTN_ENVIAR)
    );
  }
}
