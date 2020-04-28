package co.com.red5g.questions;

import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.BTN_CREAR_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.NuevoCreditoPage.LBL_MENSAJE_FALLIDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CreditoLibranzaFallido implements Question<String> {

    private static final int TIEMPO = 20;

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(BTN_CREAR_CREDITO),
            WaitUntil.the(LBL_MENSAJE_FALLIDO, isVisible()).forNoMoreThan(TIEMPO).seconds());
        return LBL_MENSAJE_FALLIDO.resolveFor(actor).getText();
    }
}
