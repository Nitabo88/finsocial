package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_MENSAJE_FALLIDO;

public class LaNoCreacionDelCredito implements Question<String> {

    public static LaNoCreacionDelCredito valor() {
        return new LaNoCreacionDelCredito();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(BTN_CREAR_CREDITO));
        return LBL_MENSAJE_FALLIDO.resolveFor(actor).getText();
    }
}
