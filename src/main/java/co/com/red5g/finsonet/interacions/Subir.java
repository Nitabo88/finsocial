package co.com.red5g.finsonet.interacions;

import co.com.red5g.finsonet.exceptions.UploadFileException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.io.IOException;

import static co.com.red5g.finsonet.exceptions.UploadFileException.MENSAJE_SCRIPT;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Subir implements Interaction {
    public static final String RUTA_SCRIPT = "C:\\Users\\Licet\\Documents\\sqa_code\\src\\test\\resources\\scripts\\FileUpload.exe";

    private Subir() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
            for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
                actor.attemptsTo(JavaScriptClick.on(BTN_UPLOAD.resolveAllFor(actor).get(i)));
                try {
                    Runtime.getRuntime().exec(RUTA_SCRIPT);
                } catch (IOException e) {
                    throw new UploadFileException(MENSAJE_SCRIPT, e);
                }
                actor.attemptsTo(Click.on(BTN_CERRAR));
            }
        }
    }

    public static Subir losArchivos() {
        return instrumented(Subir.class);
    }
}