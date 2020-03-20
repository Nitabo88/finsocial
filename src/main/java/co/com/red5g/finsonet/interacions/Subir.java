package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LNK_FILE_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import java.awt.Dialog;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.LocalFileDetector;

public class Subir implements Interaction {

    public static Subir losArchivos() {
        return new Subir();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Path path = Paths.get("./src/test/resources/file/prueba.pdf");
        while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
            for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
                actor.attemptsTo(
                    JavaScriptClick.on(BTN_UPLOAD.resolveAllFor(actor).get(i)),
                    WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(20).seconds(),
                    Upload.theFile(path).to(LNK_FILE_UPLOAD),
                    Click.on(BTN_CERRAR)
                );
                BrowseTheWeb.as(actor).getDriver().manage().window().maximize();
            }
        }
    }
}