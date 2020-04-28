package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_LLAMADAS;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_HAMBURGUESA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LlamadaHuy implements Task {

    private Credito credito;

    private static final int TIEMPO = 20;

    public LlamadaHuy(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Consulta.elCreditoEnAprobacionDeCreditos(credito),
            Click.on(MNM_HAMBURGUESA),
            Click.on(IMG_FINSONET),
            WaitUntil.the(LNK_LLAMADAS, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(LNK_LLAMADAS));
    }
}
