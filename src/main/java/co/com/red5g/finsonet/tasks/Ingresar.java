package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class Ingresar implements Task {
    private Credenciales cliente;

    public Ingresar(Credenciales cliente) {
        this.cliente = cliente;
    }

    public static Performable lasCredenciales(Credenciales credenciales) {
        return instrumented(Ingresar.class, credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cliente.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(cliente.getContrasena()).into(TXT_CONTRASENA),
                Click.on(LoginFinsocialPage.BTN_ACCESO),
                WaitUntil.the(TXT_CODIGO,isCurrentlyEnabled()).forNoMoreThan(3).seconds(),
                Enter.theValue(cliente.getCodigo()).into(TXT_CODIGO),
                Click.on(LoginFinsocialPage.BTN_ENVIAR));
    }
}