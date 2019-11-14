package co.com.red5g.finsonet.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.ComercialPage.LNK_MIS_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.ListadoGestionPage.TXT_BUSQUEDA_DOCUMENTO;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_COMERCIAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class YUbicarse implements Task {


    public static Performable enMisCreditos() {
        return instrumented(YUbicarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_COMERCIAL),
                Click.on(LNK_MIS_CREDITOS),
                WaitUntil.the(TXT_BUSQUEDA_DOCUMENTO, isVisible()),
                Enter.theValue("93451337").into(TXT_BUSQUEDA_DOCUMENTO)
        );
    }
}
