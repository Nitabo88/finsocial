package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.NOMBRE_COMPLETO;

public class NoPuede implements Question<Boolean> {

    private static final String MENSAJE_NO_REGISTRA = "NO REGISTRA";

    public static NoPuede crearCreditos() {
        return new NoPuede();
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        return (NOMBRE_COMPLETO.resolveFor(actor).getText().contains(this.MENSAJE_NO_REGISTRA));
    }
}
