package co.com.red5g.task;

import co.com.red5g.Interaction.EncontrarCedula;
import co.com.red5g.userinterfaces.ChequeoPage;
import co.com.red5g.userinterfaces.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class ConfirmarCred implements Task {

    private int cedula;

    public ConfirmarCred(int cedula) {
        this.cedula = cedula;    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target a = ConfirmPage.encontrar(cedula);
        actor.attemptsTo(
                Scroll.to(a).andAlignToTop(),
                WaitUntil.the(a ,isCurrentlyVisible()),
                WaitUntil.the(a,isClickable()),
                JavaScriptClick.on(a),
                Click.on(ConfirmPage.BTN_ACCION),
                Click.on(ConfirmPage.BTN_CONFIRMAR));
    }

    public static ConfirmarCred aprobacionConfirm(int cedula) {
        return instrumented(ConfirmarCred.class, cedula);
    }

    }

