package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioSolicitudPaso7Page {
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(net.serenitybdd.core.annotations.findby.By.id("btnRegresar_7"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(net.serenitybdd.core.annotations.findby.By.id("btnEnviar_7"));

    private FormularioSolicitudPaso7Page() {
        throw new IllegalStateException("Utility class");
    }
}
