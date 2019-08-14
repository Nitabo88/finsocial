package co.com.red5g.task;


import co.com.red5g.userinterfaces.ChequeoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ChequearCred implements Task {

    private int cedula;

   public ChequearCred(int cedula) {
       this.cedula = cedula;    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       Target a = ChequeoPage.encontrar(cedula);
        actor.attemptsTo(
                Scroll.to(a).andAlignToTop(),
                WaitUntil.the(a ,isCurrentlyVisible()),
                WaitUntil.the(a,isClickable()),
                JavaScriptClick.on(a),
                JavaScriptClick.on(ChequeoPage.PAPELERIA),
                JavaScriptClick.on(ChequeoPage.ACEPTAR),
                WaitUntil.the(ChequeoPage.ACEPTAR2 ,isCurrentlyVisible()),
                WaitUntil.the(ChequeoPage.ACEPTAR2 ,isClickable()),
                JavaScriptClick.on(ChequeoPage.ACEPTAR2),
                WaitUntil.the(ChequeoPage.CHECK1 ,isCurrentlyVisible()),
                JavaScriptClick.on(ChequeoPage.CHECK1),
                JavaScriptClick.on(ChequeoPage.CHECK2),
                JavaScriptClick.on(ChequeoPage.CHECK3),
                JavaScriptClick.on(ChequeoPage.CHECK4),
                JavaScriptClick.on(ChequeoPage.CHECK5),
                JavaScriptClick.on(ChequeoPage.CHECK6),
                JavaScriptClick.on(ChequeoPage.CHECK7),
                JavaScriptClick.on(ChequeoPage.CHECK8),
                JavaScriptClick.on(ChequeoPage.CHECK9),
                Scroll.to(ChequeoPage.CHECK10).andAlignToTop(),
                JavaScriptClick.on(ChequeoPage.CHECK10),
                JavaScriptClick.on(ChequeoPage.CHECK11),
                JavaScriptClick.on(ChequeoPage.CHECK12),
                JavaScriptClick.on(ChequeoPage.CHECK13),
                JavaScriptClick.on(ChequeoPage.CHECK14),
                JavaScriptClick.on(ChequeoPage.CHECK15),
                JavaScriptClick.on(ChequeoPage.BTN_GUARDAR));
    }

    public static ChequearCred aprobacionChequeo(int cedula) {
        return instrumented(ChequearCred.class, cedula);
    }

}

