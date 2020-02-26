package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_MENSAJE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QueElChequeoDeDocumentos implements Question<String> {

    public static QueElChequeoDeDocumentos noSeGuardo() {
        return new QueElChequeoDeDocumentos();
    }

    @Override
    public String answeredBy(final Actor actor) {
        return LBL_MENSAJE.resolveFor(actor).getText();
    }
}