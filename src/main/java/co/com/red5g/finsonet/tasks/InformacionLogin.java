package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
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
            Click.on(LoginFinsonetPage.BTN_ACCESO));
        actor.attemptsTo(
                Check.whether((!TXT_CELULAR.resolveFor(actor).isPresent()))
                        .andIfSo(
                                Enter.theValue(this.cliente.getCodigo()).into(TXT_CODIGO),
                                Click.on(BTN_ENVIAR))
                        .otherwise(
                                Enter.theValue(this.cliente.getCelular()).into(TXT_CELULAR),
                                Enter.theValue(this.cliente.getEmail()).into(TXT_CORREO),
                                Enter.theValue(this.cliente.getNueva_contrasena()).into(TXT_NUEVA_CONTRASEÑA),
                                Enter.theValue(this.cliente.getNueva_contrasena()).into(TXT_NUEVA_CONTRASEÑA1),
                                Click.on(BTN_ACTUALIZAR_CONTRASEÑA),
                                Enter.theValue(this.cliente.getUsuario()).into(TXT_USUARIO),
                                Enter.theValue(this.cliente.getContrasena()).into(TXT_CONTRASENA),
                                Enter.theValue(this.cliente.getCodigo()).into(TXT_CODIGO),
                                Click.on(BTN_ENVIAR))
        );
    }
}