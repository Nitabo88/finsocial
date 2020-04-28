package co.com.red5g.interacions.finsonet;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Path;
import java.nio.file.Paths;

import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_UPLOAD_HUY;
import static co.com.red5g.userinterfaces.finsonet.FormalizacionPage.*;

public class SubirArchivosChequeoDocumentoHuy implements Performable {

  @Override
  public <T extends Actor> void performAs(T actor) {
    Desactivar.ventanaSubirArchivo();
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    while (!BTN_UPLOAD_HUY.resolveAllFor(actor).isEmpty()) {
      actor.attemptsTo(
              JavaScriptClick.on(BTN_UPLOAD_HUY.resolveFor(actor)),
              JavaScriptClick.on(BTN_SELECCIONAR_ARCHIVO),
              Upload.theFile(path).to(LNK_FILE),
              Click.on(BTN_ENVIAR_FILE));
    }
  }
}
