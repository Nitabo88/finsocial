package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioSolicitudPaso8Page {
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(By.id("btnRegresar_8"));
    public static final Target BTN_ENVIAR= Target.the("el boton enviar").located(By.xpath("//button[contains(.,'Enviar')]"));
    public static final Target BTN_SUBIR_DOCUMENTOS= Target.the("el boton subir documentos").located(By.id("subOD"));

    private FormularioSolicitudPaso8Page() {
        throw new IllegalStateException("Utility class");
    }
}
