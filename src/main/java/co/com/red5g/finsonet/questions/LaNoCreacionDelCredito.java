package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_MENSAJE_FALLIDO;

public class LaNoCreacionDelCredito implements Question<String> {

    public static Question<String> valor() {
        return new LaNoCreacionDelCredito();
    }


    @Override
    public String answeredBy(Actor actor) {
        return LBL_MENSAJE_FALLIDO.resolveFor(actor).getText();
    }
}
