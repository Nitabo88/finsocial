package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_ENVIAR_FILE;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_SELECCIONAR_ARCHIVO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LNK_FILE;

import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;

public class SubirArchivosFormalizacion implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    Desactivar.ventanaSubirArchivo();
    while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
      for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
        actor.attemptsTo(
            JavaScriptClick.on(BTN_UPLOAD.resolveAllFor(actor).get(i)),
            JavaScriptClick.on(BTN_SELECCIONAR_ARCHIVO),
            Upload.theFile(path).to(LNK_FILE),
            Click.on(BTN_ENVIAR_FILE));
      }
    }
  }
}