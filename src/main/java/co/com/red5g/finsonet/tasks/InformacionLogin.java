package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.*;

public class InformacionLogin implements Task {

  private final Credenciales cliente;

  public InformacionLogin(final Credenciales cliente) {
    this.cliente = cliente;
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    actor.attemptsTo(
            Enter.theValue(this.cliente.getUsuario()).into(TXT_USUARIO),
            Enter.theValue(this.cliente.getContrasena()).into(TXT_CONTRASENA),
            Click.on(BTN_ENVIAR));
    actor.attemptsTo(
            Check.whether((!TXT_CELULAR.resolveFor(actor).isPresent()))
                    .andIfSo(
                            Enter.theValue(this.cliente.getCodigo()).into(TXT_CODIGO),
                            Click.on(BTN_ENVIAR))
                    .otherwise(
                            Enter.theValue(this.cliente.getCelular()).into(TXT_CELULAR),
                            Enter.theValue(this.cliente.getEmail()).into(TXT_CORREO),
                            Enter.theValue(this.cliente.getContrasena()).into(TXT_NUEVA_CONTRASENA),
                            Enter.theValue(this.cliente.getContrasena()).into(TXT_CONFIRMACION_CONTRASENA),
                            Click.on(BTN_ENVIAR),
                            Enter.theValue(this.cliente.getUsuario()).into(TXT_USUARIO),
                            Enter.theValue(this.cliente.getContrasena()).into(TXT_CONTRASENA),
                            Click.on(BTN_ENVIAR),
                            Enter.theValue(this.cliente.getCodigo()).into(TXT_CODIGO),
                            Click.on(BTN_ENVIAR))
    );
  }
}