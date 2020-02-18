package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FormularioSolicitudPaso1Page {
    public static final Target BTN_CIUDADES = Target.the("seleccionar la ciudad").located(By.xpath("//button[@data-id='txtCiuC']"));
    public static final Target FILTRO_CIUDADES = Target.the("lista de ciudades").located(org.openqa.selenium.By.xpath("//div[contains(@class,'requerir dropup open')]//input[@class='form-control']"));
    public static final Target TXT_CALIFICACION = Target.the("la calificacion").located(org.openqa.selenium.By.id("txtCalf"));
    public static final Target RBN_INSTRUCCIONES = Target.the("Selecciona la opcion").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]");
    public static final Target BTN_AGENCIA_VINCULACION = Target.the("seleccionar la agencia de vinculacion").located(org.openqa.selenium.By.xpath("//button[@data-id='a_vinculacion']"));
    public static final Target FILTRO_AGENCIA_VINCULACION = Target.the("lista de las agencias de vinculacion").locatedBy("//div[contains(@class,'input-form requerir dropup open')]//li[contains(.,'{0}')]");
    public static final Target TXT_MONTO = Target.the("el monto").located(org.openqa.selenium.By.id("txtMonto"));
    public static final Target TXT_TASA_INTERES= Target.the("la tasa de interes").located(org.openqa.selenium.By.id("tasaI"));
    public static final Target TXT_CUOTA= Target.the("el numero de cuotas").located(org.openqa.selenium.By.id("cuota"));
    public static final Target TXT_TASA_MORA= Target.the("la tasa de mora").located(org.openqa.selenium.By.id("tasaM"));
    public static final Target TXT_PLAZO= Target.the("el plazo").located(org.openqa.selenium.By.id("txtPlaz"));
    public static final Target TXT_TASA_MAXIMA_VIGENTE= Target.the("la tasa maxima legal vigente").located(org.openqa.selenium.By.id("tasaMax"));
    public static final Target BTN_GUARDAR_CONTINUAR= Target.the("el boton guardar y continuar").located(org.openqa.selenium.By.id("btnEnviar_1"));

    private FormularioSolicitudPaso1Page() {
        throw new IllegalStateException("Utility class");
    }
}
