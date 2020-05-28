package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;

public class ChequeoDocumentoLibranza implements Task {

    public ChequeoDocumentoLibranza(Credito credito) {
        this.credito = credito;
    }

    private final Credito credito;

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