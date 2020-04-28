package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_ORIGINACION;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChequeoDocumentoLibranza implements Task {

    public ChequeoDocumentoLibranza(Credito credito) {
        this.credito = credito;
    }

    private Credito credito;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ubicarse.enElFormulario(credito),
            Diligencia.laSolicitudDeCredito(),
            cambiarPestana(),
            Click.on(LNK_HOME),
            WaitFor.seconds(3),
            Click.on(LNK_ORIGINACION)
        );
    }
}