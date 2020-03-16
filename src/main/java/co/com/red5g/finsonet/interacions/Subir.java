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

   public static Subir losArchivos() {
       return new Subir();
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
      while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
        for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
          actor.attemptsTo(Click.on(BTN_UPLOAD.resolveAllFor(actor).get(i)));
          try {
            String RUTA_SCRIPT = "./src/test/resources/scripts/ScriptUploadFile.exe";
            Runtime.getRuntime().exec(RUTA_SCRIPT);
          } catch (IOException e) {
            logger.log(Level.INFO, String.valueOf(e));
          }
          actor.attemptsTo(
              Click.on(BTN_CERRAR));
        }
      }
    }
}