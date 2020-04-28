package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Ingresar;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SolicitudCredito implements Task {

    private Credito credito;

    public SolicitudCredito(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Loguearse.enFinsonet(),
            Ubicarse.enNuevoCredito(),
            Ingresa.laInformacionDelCredito(credito),
            Ingresar.enFormularioDeSolicitud());
    }
}