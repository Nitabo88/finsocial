package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormularioSolicitudPaso7Page {
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_7"));

    private FormularioSolicitudPaso7Page() {
        throw new IllegalStateException("Utility class");
    }
}
