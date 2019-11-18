package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Abrir;
import co.com.red5g.finsonet.interacions.Ingresar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static co.com.red5g.finsonet.models.builder.CreditoBuilder.la;
import static co.com.red5g.finsonet.tasks.Ingresa.Diligenciar;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ubicarse implements Task {

    public static Performable enElFormulario() {
        return instrumented(Ubicarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Abrir.laPaginaPrincipal(),
                co.com.red5g.finsonet.tasks.Ingresar.lasCredenciales(de().unUsuarioBasico()),
                SeUbica.enNuevoCredito(),
                Diligenciar(la().informacionDelCredito()),
                Ingresar.enFormularioDeSolicitud());
    }
}
