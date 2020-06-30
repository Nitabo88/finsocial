package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LNK_FILE_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SubirArchivosChequeoDocumento implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    actor.attemptsTo(Desactivar.ventanaSubirArchivo());
    while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
      actor.attemptsTo(
          Click.on(BTN_UPLOAD.resolveFor(actor)),
          Upload.theFile(path).to(LNK_FILE_UPLOAD),
          Click.on(BTN_CERRAR),
          WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds());
    }
  }
}