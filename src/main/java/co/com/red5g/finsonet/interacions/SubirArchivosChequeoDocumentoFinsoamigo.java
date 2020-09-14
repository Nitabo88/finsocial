package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_CERRAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_UPLOAD_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LNK_FILE_UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SubirArchivosChequeoDocumentoFinsoamigo implements Performable {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Path path = Paths.get("./src/test/resources/file/prueba.pdf");
        actor.attemptsTo(Desactivar.ventanaSubirArchivo(),
            WaitFor.seconds(TIEMPO_3));
        while (!BTN_UPLOAD_FINSOAMIGO.resolveAllFor(actor).isEmpty()) {
            actor.attemptsTo(
                JavaScriptClick.on(BTN_UPLOAD_FINSOAMIGO.resolveAllFor(actor).get(0)),
                Upload.theFile(path).to(LNK_FILE_UPLOAD),
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
                Click.on(BTN_CERRAR),
                WaitFor.seconds(TIEMPO_3));
        }
    }
}
