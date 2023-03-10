package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class NuevoCreditoPage {
    public static final Target TXT_DOCUMENTO = Target.the("el documento").located(By.id("textoDoc"));
    public static final Target TXT_FECHA_NACIMIENTO = Target.the("la fecha de nacimiento").located(By.id("textoFechaNac"));
    public static final Target TXT_NOMBRE_COMPLETO = Target.the("el nombre completo").located(By.id("textoNom"));
    public static final Target TXT_CARGO = Target.the("el valor de la cuota").located(By.id("textoCargo"));
    public static final Target TXT_CIUDAD = Target.the("la ciudad").located(By.id("textoMuni"));
    public static final Target TXT_CENTRO_COSTOS = Target.the("el centro de costos").located(By.id("textoCol"));
    public static final Target TXT_DIRECCION = Target.the("la direccion").located(By.id("textoVlrCuota"));
    public static final Target TXT_TELEFONO = Target.the("el telefono").located(By.id("textoTel"));
    public static final Target TXT_CUPO_DISPONIBLE = Target.the("el cupo disponible").located(By.id("textoCupDis"));
    public static final Target TXT_SEXO = Target.the("el cupo disponible").located(By.id("comboSex"));
    public static final Target TXT_EMAIL = Target.the("el campo email").located(By.id("textoEmail"));
    public static final Target TXT_VALOR_CUOTA = Target.the("el valor de la cuota").located(By.id("textoVlrCuota"));
    public static final Target TXT_PLAZO = Target.the("el numero de cuotas").located(By.id("textoNumCuotas"));
    public static final Target TBL_INFORMACION_CREDITOS = Target.the("La Tabla de informacion este visible").located(By.id("tablaInfo"));
    public static final Target LBL_INFORMACION_ADICIONAL = Target.the("el label que carga en pantalla").located(By.xpath("//td[contains(text(),'ASIGNACIONES ADICIONALES')]"));
    public static final Target LBL_MENSAJE_PAPELERIA = Target.the("el mensaje emergente de papeleria").located(By.xpath("//p[@class='p-sweet Tp-sweet'][contains(text(),'papeleria')]"));
    public static final Target LST_PAPELERIA = Target.the("la lista de papeleria").located(By.id("codPapeleria"));
    public static final Target BTN_OK = Target.the("el boton OK").located(By.xpath("//button[contains(text(),'OK')]"));
    public static final Target BTN_CREAR_CREDITO = Target.the("el boton crear credito").located(By.id("btn_Dif"));
    public static final Target BTN_ENVIANDO= Target.the("el boton enviando").located(By.xpath("//button[text()='Enviando...']"));
    public static final Target LBL_MENSAJE_CREACION_CREDITO= Target.the("el mensaje de cr??dito creado").located(By.xpath("//p[contains(text(),'Cr??dito registrado satisfactoriamente.')]"));
    public static final Target LBL_MENSAJE_FALLIDO = Target.the("el mensaje de falla").located(By.xpath("//h2//following-sibling::p"));
    public static final Target LBL_MENSAJE_BLOQUEADO = Target.the("el texto de documento bloqueado")
        .located(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li[text()='bloqueado.']"));

    private NuevoCreditoPage() {
        throw new IllegalStateException("Utility class");
    }
}