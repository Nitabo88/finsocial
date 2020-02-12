package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class Subir implements Interaction {

    Logger logger;

    public Subir() {
    }

    public static Subir losArchivos() {
        return new Subir();
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
            for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
                actor.attemptsTo(Click.on(BTN_UPLOAD.resolveAllFor(actor).get(i)));
                try {
                    final String RUTA_SCRIPT = "C:\\Users\\Licet\\Documents\\sqa_code\\src\\test\\resources\\scripts\\FileUpload.exe";
                    Runtime.getRuntime().exec(RUTA_SCRIPT);
                } catch (final IOException e) {
                  this.logger.log(Level.INFO, String.valueOf(e));
                }
                actor.attemptsTo(
                    Click.on(BTN_CERRAR));
            }
        }
    }
}