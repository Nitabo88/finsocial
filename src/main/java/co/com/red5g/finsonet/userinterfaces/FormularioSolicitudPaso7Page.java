package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormularioSolicitudPaso7Page {
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(By.id("btnRegresar_7"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_7"));

    private FormularioSolicitudPaso7Page() {
        throw new IllegalStateException("Utility class");
    }
}
