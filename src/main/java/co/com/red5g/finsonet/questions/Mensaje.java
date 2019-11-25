package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.LBL_MENSAJE_BIENVENIDA;


public class Mensaje implements Question<Boolean> {

    private String mensajeBienvenida;

    public Mensaje(String strMensaje) {
        this.mensajeBienvenida = strMensaje;
    }

    public static Mensaje deBienvenidaEs(String strMensaje) {
        return new Mensaje(strMensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (LBL_MENSAJE_BIENVENIDA.resolveFor(actor).getText().contains(mensajeBienvenida));
    }
}