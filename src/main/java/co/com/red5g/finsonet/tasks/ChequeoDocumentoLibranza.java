package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.BTN_MI_CUENTA;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.MNM_MI_CUENTA;
import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChequeoDocumentoLibranza implements Task {

    public ChequeoDocumentoLibranza(Credito credito) {
        this.credito = credito;
    }

    private Credito credito;
    private static final String SALIR = "Salir";

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCedula = actor.recall(CEDULA_ACTOR);
        actor.attemptsTo(
            Ubicarse.enElFormulario(credito),
            Diligencia.laSolicitudDeCreditoBackEnd(de().unUsuarioAdministrador(), con().informacionLibranza(), numeroCedula),
            Click.on(BTN_MI_CUENTA),
            Click.on(MNM_MI_CUENTA.of(SALIR)),
            Loguearse.enFinsonet(),
            WaitUntil.the(LNK_ORIGINACION, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
            WaitFor.seconds(TIEMPO_3),
            Click.on(LNK_ORIGINACION)
        );
    }
}