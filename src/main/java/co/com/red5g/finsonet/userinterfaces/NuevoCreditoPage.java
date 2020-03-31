package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class NuevoCreditoPage {
    public static final Target TXT_DOCUMENTO = Target.the("documento").located(By.id("textoDoc"));
    public static final Target TXT_VALOR_CUOTA = Target.the("el valor de la cuota").located(By.id("textoVlrCuota"));
    public static final Target TXT_PLAZO = Target.the("el numero de cuotas").located(By.id("textoNumCuotas"));
    public static final Target TBL_INFORMACION_CREDITOS=Target.the("La Tabla de informacion este visible").located(By.id("tablaInfo"));
    public static final Target BTN_OK = Target.the("el boton OK").located(By.xpath("//button[contains(text(),'OK')]"));
    public static final Target BTN_CREAR_CREDITO = Target.the("el boton crear credito").located(By.id("btn_Dif"));
    public static final Target LBL_MENSAJE_FALLIDO = Target.the("el mensaje de falla").located(
        By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2//following-sibling::p"));
    public static final Target TXT_NOMBRE_COMPLETO = Target.the("el input de nombre completo").located(By.id("textoNom"));

    private NuevoCreditoPage() {
        throw new IllegalStateException("Utility class");
    }
}