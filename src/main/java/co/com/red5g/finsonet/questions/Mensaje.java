package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage.LBL_MENSAJE_BIENVENIDA;
import static co.com.red5g.finsonet.utils.UtileriaFechas.formatearFechaServidorUTC;


public class Mensaje implements Question<Boolean> {

    private String mensaje;

    public Mensaje(String strMensaje) {
        this.mensaje = strMensaje;
    }

    public static Mensaje deBienvenidaEs(String strMensaje) {
        return new Mensaje(strMensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (LBL_MENSAJE_BIENVENIDA.resolveFor(actor).getText().contains(mensaje));
    }
}