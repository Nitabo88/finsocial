package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.IMG_FINSONET;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_LLAMADAS;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_HAMBURGUESA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Llamada implements Task {

    private static final int TIEMPO = 20;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Consulta.elCreditoEnAprobacionDeCreditos(),
            Click.on(MNU_HAMBURGUESA),
            Click.on(IMG_FINSONET),
            WaitUntil.the(LNK_LLAMADAS, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(LNK_LLAMADAS));
    }
}
