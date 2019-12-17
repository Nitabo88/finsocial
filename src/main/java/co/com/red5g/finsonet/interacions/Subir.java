package co.com.red5g.finsonet.interacions;

import com.sun.istack.logging.Logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.io.IOException;
import java.util.logging.Level;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Subir implements Interaction {
    public static final String RUTA_SCRIPT = "C:\\Users\\Licet\\Documents\\sqa_code\\src\\test\\resources\\scripts\\FileUpload.exe";
    Logger logger;

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
                   logger.log(Level.INFO, String.valueOf(e));
                }
                actor.attemptsTo(Click.on(BTN_CERRAR));
            }
        }
    }

    public static Subir losArchivos() {
        return instrumented(Subir.class);
    }
}