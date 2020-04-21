package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LNK_FILE_UPLOAD;

import co.com.devco.automation.mobile.actions.WaitFor;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;

public class SubirArchivosChequeoDocumento implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Path path = Paths.get("./src/test/resources/file/prueba.pdf");
       Desactivar.ventanaSubirArchivo();
        while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
            for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
                actor.attemptsTo(
                    WaitFor.seconds(4),
                    Click.on(BTN_UPLOAD.resolveAllFor(actor).get(i)),
                    Upload.theFile(path).to(LNK_FILE_UPLOAD),
                    Click.on(BTN_CERRAR)
                );
            }
        }
    }
}