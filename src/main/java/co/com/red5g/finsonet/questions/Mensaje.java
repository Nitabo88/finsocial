package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.LBL_MENSAJE_BIENVENIDA;


public class Mensaje implements Question<Boolean> {

    private final String mensajeBienvenida;

    public Mensaje(final String strMensaje) {
      mensajeBienvenida = strMensaje;
    }

    public static Mensaje deBienvenidaEs(final String strMensaje) {
        return new Mensaje(strMensaje);
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        return (LBL_MENSAJE_BIENVENIDA.resolveFor(actor).getText().contains(this.mensajeBienvenida));
    }
}