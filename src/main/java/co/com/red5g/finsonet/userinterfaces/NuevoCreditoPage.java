package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuevoCreditoPage {
    public static final Target TXT_DOCUMENTO = Target.the("documento").located(By.id("textoDoc"));
    public static final Target TXT_TELEFONO = Target.the("telefono").located(org.openqa.selenium.By.id("textoTel"));
    public static final Target TXT_EMAIL = Target.the("correo electronico").located(org.openqa.selenium.By.id("textoEmail"));
    public static final Target TXT_VALOR_CUOTA = Target.the("el valor de la cuota").located(org.openqa.selenium.By.id("textoVlrCuota"));
    public static final Target TXT_PLAZO = Target.the("el numero de cuotas").located(org.openqa.selenium.By.id("textoNumCuotas"));
    public static final Target TBL_INFORMACION_CREDITOS=Target.the("La Tabla de informacion este visible").located(org.openqa.selenium.By.id("tablaInfo"));
    public static final Target BTN_OK = Target.the("el boton OK").located(org.openqa.selenium.By.xpath("//button[contains(text(),'OK')]"));
    public static final Target BTN_CREAR_CREDITO = Target.the("el boton crear credito").located(org.openqa.selenium.By.id("btn_Dif"));
    public static final Target FRM_EMERGENTE =  Target.the("la ventana con el mensaje").located(org.openqa.selenium.By.xpath("//div[@class='sweet-alert showSweetAlert visible']"));
    public static final Target LBL_MENSAJE_FALLIDO = Target.the("el mensaje de falla").located(
        org.openqa.selenium.By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2//following-sibling::p"));
    public static final Target NOMBRE_COMPLETO = Target.the("el input de nombre completo").located(By.id("textoNom"));

    private NuevoCreditoPage() {
        throw new IllegalStateException("Utility class");
    }
}