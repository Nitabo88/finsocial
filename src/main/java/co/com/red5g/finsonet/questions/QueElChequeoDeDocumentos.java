package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_MENSAJE;

public class QueElChequeoDeDocumentos implements Question<String> {

    public static QueElChequeoDeDocumentos noSeGuardo() {
        return new QueElChequeoDeDocumentos();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_MENSAJE.resolveFor(actor).getText();
    }
}
