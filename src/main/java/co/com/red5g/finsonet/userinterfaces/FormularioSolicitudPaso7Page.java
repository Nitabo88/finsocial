package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioSolicitudPaso7Page {
    public static final Target LST_CALIFICACION_CLIENTE = Target.the("la calificiacion que da el cliente al asesor").located(By.id("cmbSatisfaccionC"));
    public static final Target TXT_RAZON_CALIFICACION = Target.the("el motivo de la calificacion").located(By.id("txtPorqueSatic"));
    public static final Target LST_COMO_CONOCIO_FINSOCIAL = Target.the("como conocio a finsocial").located(By.id("cmbConocioFinsocial"));
    public static final Target TXT_OTRA_RAZON = Target.the("cual fue la otra forma por la cual se entero de finsocial").located(By.id("txtOtroConocer"));
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(net.serenitybdd.core.annotations.findby.By.id("btnRegresar_7"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(net.serenitybdd.core.annotations.findby.By.id("btnEnviar_7"));

    private FormularioSolicitudPaso7Page() {
        throw new IllegalStateException("Utility class");
    }
}
