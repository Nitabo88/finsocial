package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.NOMBRE_COMPLETO;

public class NoPuede implements Question<Boolean> {

    private final String mensajeNoRegistra;

    public NoPuede(final String strMensaje) {
        mensajeNoRegistra = strMensaje;
    }

    public static NoPuede crearCreditos(final String strMensaje) {
        return new NoPuede(strMensaje);
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        return (NOMBRE_COMPLETO.resolveFor(actor).getText().contains(this.mensajeNoRegistra));
    }
}
