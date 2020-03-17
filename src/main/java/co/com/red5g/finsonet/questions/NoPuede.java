package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.NOMBRE_COMPLETO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NoPuede implements Question<String> {

    public NoPuede() {
    }

    public static NoPuede crearCreditos() {
        return new NoPuede();
    }

    @Override
    public String answeredBy(final Actor actor) {
        return (NOMBRE_COMPLETO.resolveFor(actor).getValue());
    }
}
