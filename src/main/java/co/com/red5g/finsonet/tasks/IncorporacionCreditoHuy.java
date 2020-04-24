package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.*;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;

public class IncorporacionCreditoHuy implements Task {

    private static final String SALIR = "Salir";
    private Credito credito;
    private static final String INCORPORACION = "Incorporación";

    public IncorporacionCreditoHuy(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Consulta.elCreditoEnAprobacionDeCreditosHuy(credito),
                Diligencia.laAprobacionDelCreditonEnIncorporacionHuy(),
                JavaScriptClick.on(BTN_MI_CUENTA),
                JavaScriptClick.on(MNM_MI_CUENTA.of(SALIR)),
                Ingresa.lasCredenciales(de().unUsuarioBasico()),
                WaitFor.seconds(2),
                JavaScriptClick.on(LNK_ORIGINACION),
                Click.on(MNM_ORIGINACION.of(INCORPORACION))
        );
    }
}
