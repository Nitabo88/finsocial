package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormularioSolicitudPaso8Page {

    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(By.id("btnRegresar_8"));
    public static final Target BTN_ENVIAR = Target.the("el boton enviar").located(By.xpath("//button[contains(.,'Enviar')]"));
    public static final Target BTN_SUBIR_DOCUMENTOS = Target.the("el boton subir documentos").located(By.id("subOD"));
    public static final Target BTN_ENCUESTA = Target.the("el boton de encuesta").locatedBy("//p[text()='{0}']//ancestor::div[@class='grid-item']");
    public static final Target BTN_ENVIAR_ENCUESTA = Target.the("el boton enviar encuesta").locatedBy("#btn-guardar-contacto");
    public static final Target BTN_ACEPTAR_ENCUESTA = Target.the("el boton aceptar encuesta").located(By.xpath("//button[text()='Aceptar']"));

    private FormularioSolicitudPaso8Page() {
        throw new IllegalStateException("Utility class");
    }
}

