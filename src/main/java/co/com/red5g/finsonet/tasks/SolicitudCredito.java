package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Ingresar;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;

public class SolicitudCredito implements Task {

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Loguearse.enFinsonet(),
                Ubicarse.enNuevoCredito(),
                Ingresa.laInformacionDelCredito(la().informacionDelCredito()),
                Ingresar.enFormularioDeSolicitud());
    }
}