package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_ENVIAR_FILE;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.BTN_SELECCIONAR_ARCHIVO;
import static co.com.red5g.finsonet.userinterfaces.FormalizacionPage.LNK_FILE;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;
import org.openqa.selenium.JavascriptExecutor;

public class SubirArchivosChequeoDocumentoHuy implements Performable {

  @Override
  public <T extends Actor> void performAs(T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    ((JavascriptExecutor) getProxiedDriver())
        .executeScript(
            "HTMLInputElement.prototype.click = function() { if(this.type !== 'file') HTMLElement.prototype.click.call(this); };");
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
