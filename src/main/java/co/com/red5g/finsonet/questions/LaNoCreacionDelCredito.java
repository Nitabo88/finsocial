package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.red5g.finsonet.interacions.EnfocarPopUp.enfocarPopUp;
import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.LBL_MENSAJE_FALLIDO;

public class LaNoCreacionDelCredito implements Question<String> {

    public static LaNoCreacionDelCredito valor() {
        return new LaNoCreacionDelCredito();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(enfocarPopUp());
        return Text.of(LBL_MENSAJE_FALLIDO).viewedBy(actor).asString();
    }
}
