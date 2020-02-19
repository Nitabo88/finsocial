package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.TXT_CODIGO;
import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.TXT_CONTRASENA;
import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.TXT_USUARIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

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
            Click.on(LoginFinsonetPage.BTN_ACCESO),
            WaitUntil.the(TXT_CODIGO, isCurrentlyEnabled()).forNoMoreThan(3).seconds(),
            Enter.theValue(this.cliente.getCodigo()).into(TXT_CODIGO),
            Click.on(LoginFinsonetPage.BTN_ENVIAR)
        );
    }
}