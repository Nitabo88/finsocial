package co.com.red5g.wiipo.tasks;

import co.com.red5g.wiipo.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.red5g.wiipo.userinterfaces.LoginWiipoPage.*;

public class InformacionLoginWiipo implements Task {
    Credenciales credenciales;

    public InformacionLoginWiipo(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(credenciales.getTipoDocumento()).from(LST_TIPO_DOCUMENTO),
                Enter.theValue(credenciales.getUsuario()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(credenciales.getContrasena()).into(TXT_CONTRASENA),
                Click.on(BTN_ENTRAR)
        );
    }
}
