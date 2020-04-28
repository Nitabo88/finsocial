package co.com.red5g.tasks.finsonet;

import co.com.red5g.interacions.Ingresar;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import co.com.red5g.tasks.factories.finsonet.Loguearse;
import co.com.red5g.tasks.factories.finsonet.Ubicarse;
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