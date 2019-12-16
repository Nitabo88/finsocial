package co.com.red5g.finsonet.interacions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.awt.*;
import java.awt.event.KeyEvent;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Subir implements Interaction {
    private static final String RUTA_ARCHIVO = "C:/Users/Licet/Documents/sqa_code/src/test/resources/files/prueba.pdf";

    public Subir() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!BTN_UPLOAD.resolveAllFor(actor).isEmpty()) {
            for (int i = 0; i < BTN_UPLOAD.resolveAllFor(actor).size(); i++) {
                actor.attemptsTo(JavaScriptClick.on(BTN_UPLOAD.resolveAllFor(actor).get(i)));
                LBL_UPLOAD.resolveFor(actor).sendKeys(RUTA_ARCHIVO);
                actor.attemptsTo(Click.on(BTN_CERRAR));
                getProxiedDriver().findElement(By.id("SWFUpload_0")).click();
                Robot r = null;
                try {
                    r = new Robot();
                    r.keyPress(KeyEvent.VK_ESCAPE);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Subir losArchivos() {
        return instrumented(Subir.class);
    }
}