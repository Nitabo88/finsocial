package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LNK_FILE_UPLOAD;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;
import org.openqa.selenium.JavascriptExecutor;

public class Subir implements Interaction {

    public static Subir losArchivos() {
        return new Subir();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Path path = Paths.get("./src/test/resources/file/prueba.pdf");
        ((JavascriptExecutor) getProxiedDriver()).executeScript(
            "HTMLInputElement.prototype.click = function() { if(this.type !== 'file') HTMLElement.prototype.click.call(this); };");
        while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
            for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
                actor.attemptsTo(
                    JavaScriptClick.on(BTN_UPLOAD.resolveAllFor(actor).get(i)),
                    Upload.theFile(path).to(LNK_FILE_UPLOAD),
                    Click.on(BTN_CERRAR)
                );
            }
        }
    }
}