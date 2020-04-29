package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EnquestaFidelizacionPage {

    public static final Target BTN_REALIZAR_ENCUESTA = Target.the("boton realizar encuesta").locatedBy(("//button[@onclick='irEncuesta();']"));
    public static final Target RDB_PREGUNTA_1 = Target.the("respuesta pregunta 1").located(By.id("respuesta11"));
    public static final Target RDB_PREGUNTA_2 = Target.the("respuesta pregunta 2").located(By.id("respuesta21"));
    public static final Target BTN_ENCUESTA_GUARDAR = Target.the("boton guardar encuesta").located(By.id("btnGuardar"));
    public static final Target TXT_DOCUMENTO_ENCUESTA = Target.the("documento de la encuesta").located(By.id("numId"));
    public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[text()='Aceptar']"));

    private EnquestaFidelizacionPage() {
        throw new IllegalStateException("Utility class");
    }
}
