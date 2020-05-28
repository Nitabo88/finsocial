package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlamadaHuy implements Task {

    private final Credito credito;

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
