package co.com.red5g.wiipo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.wiipo.userinterfaces.LoginWiipoPage.LBL_MENSAJE_BIENVENIDA;

public class Mensaje implements Question<String> {

    public static Mensaje deBienvenida() {
        return new Mensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_MENSAJE_BIENVENIDA.resolveFor(actor).getText();
    }
}