package co.com.red5g.questions;

import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LBL_MENSAJE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QueElChequeoDeDocumentos implements Question<String> {

    public static QueElChequeoDeDocumentos noSeGuardo() {
        return new QueElChequeoDeDocumentos();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_MENSAJE.resolveFor(actor).getText();
    }
}