package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TotalPasivos implements Question<Boolean> {

    public static TotalPasivos esCorrecto() {
        return new TotalPasivos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
