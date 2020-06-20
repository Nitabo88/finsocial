package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Path;
import java.nio.file.Paths;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class SubirArchivosChequeoDocumento implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    actor.attemptsTo(Desactivar.ventanaSubirArchivo());
    while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
      int tiempo = 60;
      actor.attemptsTo(
              Click.on(BTN_UPLOAD.resolveFor(actor)),
              Upload.theFile(path).to(LNK_FILE_UPLOAD),
              Click.on(BTN_CERRAR),
              WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(tiempo).seconds());
    }
  }
}