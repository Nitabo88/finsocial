package co.com.red5g.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.userinterfaces.FinsocialPage.FINSOCIAL_HOME_PAGE;
import static co.com.red5g.userinterfaces.LoginFinsocialComponent.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class Ingreso implements Task {

    private String usuario ;
    private String contrasena;
    private String codigo;

    public Ingreso(String usuario, String contrasena, String codigo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codigo = codigo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USUARIO,isCurrentlyEnabled()),
                Click.on(USUARIO),
                Enter.theValue(this.usuario).into(USUARIO),
                Click.on(CONTRASENA),
                Enter.theValue(this.contrasena).into(CONTRASENA),
                Click.on(ACCESO),
                //WaitUntil.the(YOUTUBE,isCurrentlyEnabled()),
                Enter.theValue(this.codigo).into(CODIGO),
                Click.on(ENVIAR));
    }


    public static Ingreso.IngresoBuilder usuario(String usuario) {
        return new Ingreso.IngresoBuilder(usuario);
    }

    public static class IngresoBuilder {
        private String usuario;
        private String contrasena;
        private String codigo;

        public IngresoBuilder(String usuario) {
            this.usuario = usuario;
        }

        public IngresoBuilder de(String contrasena) {
            this.contrasena = contrasena;
            return this;
        }

        public Ingreso a(String codigo) {
            this.codigo = codigo;
            return instrumented(Ingreso.class, this.usuario, this.contrasena, this.codigo);
        }
    }


}
