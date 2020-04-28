package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class NuevoCreditoHuyPage {
    public static final Target TXT_DOCUMENTO = Target.the("documento").located(By.id("textoDoc"));
    public static final Target TXT_VALOR_A_GIRAR = Target.the("el valor a girar").located(By.id("tdVlrGiro"));
    public static final Target TXT_PLAZO = Target.the("el numero de cuotas").located(By.id("textoNumCuotas"));
    public static final Target TBL_INFORMACION_CREDITOS = Target.the("La Tabla de informacion este visible").located(By.id("tablaInfo"));
    public static final Target LBL_INFORMACION_ADICIONAL = Target.the("el label que carga en pantalla").located(By.xpath("//td[contains(text(),'ASIGNACIONES ADICIONALES')]"));
    public static final Target LST_PAPELERIA = Target.the("la lista de papeleria").located(By.id("codPapeleria"));
    public static final Target BTN_OK = Target.the("el boton OK").located(By.xpath("//button[contains(text(),'OK')]"));
    public static final Target BTN_CREAR_CREDITO = Target.the("el boton crear credito").located(By.id("btn_Dif"));
    public static final Target BTN_ENVIANDO= Target.the("el boton enviando").located(By.xpath("//button[text()='Enviando...']"));
    public static final Target LBL_MENSAJE_FALLIDO = Target.the("el mensaje de falla").located(By.xpath("//h2//following-sibling::p"));
    public static final Target TXT_NOMBRE_COMPLETO = Target.the("el input de nombre completo").located(By.id("textoNom"));
    public static final Target LBL_MENSAJE_BLOQUEADO = Target.the("el texto de documento bloqueado")
        .located(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li[text()='bloqueado.']"));

    private NuevoCreditoHuyPage() {
        throw new IllegalStateException("Utility class");
    }
}