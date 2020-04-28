package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormularioSolicitudPaso5Page {
    public static final Target TXT_PRIMER_NOMBRE = Target.the("el primer nombre").located(By.id("txtPNConyugue"));
    public static final Target TXT_SEGUNDO_NOMBRE = Target.the("el segundo nombre").located(By.id("txtSNConyugue"));
    public static final Target TXT_PRIMER_APELLIDO = Target.the("el primer apellido").located(By.id("txtPAConyugue"));
    public static final Target TXT_SEGUNDO_APELLIDO = Target.the("el segundo apellido").located(By.id("txtSAConyugue"));
    public static final Target BTN_TIPO_DOCUMENTO = Target.the("el tipo de documento").located(By.xpath("//button[@data-id='cmbTipoDocCony']"));
    public static final Target LST_FILTROS= Target.the("el filtro de lista")
        .locatedBy("//div[@class='btn-group bootstrap-select disabled input-form open']//li[contains(.,'{0}')]");
    public static final Target TXT_DOCUMENTO_IDENTIDAD = Target.the("el numero de documento").located(By.id("txtDocConyugue"));
    public static final Target TXT_FECHA_EXPEDICION = Target.the("el fecha de expedicion del documento").located(By.id("txtFechaExpCon"));
    public static final Target BTN_LUGAR_EXPEDICION = Target.the("el lugar de expedicion del documento").located(By.xpath("//button[@data-id='txtLugarExpCon']"));
    public static final Target TXT_FECHA_NACIMIENTO = Target.the("la fecha de nacimiento").located(By.id("txtFechaNacCon"));
    public static final Target BTN_LUGAR_NACIMIENTO = Target.the("el lugar de nacimiento").located(By.xpath("//button[@data-id='txtLugarNacCon']"));
    public static final Target BTN_SEXO = Target.the("el sexo").located(By.xpath("//button[@data-id='cmbSexoCon']"));
    public static final Target TXT_LUGAR_TRABAJO = Target.the("el lugar donde trabaja").located(By.id("txtLugTrabCon"));
    public static final Target RDB_OCUPACION = Target.the("la ocupacion")
        .locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='rdOcupacionCon']");
    public static final Target RDB_DEPENDENCIA_ECONOMICA = Target.the("dependecia economica")
        .locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='txtDepEco']");
    public static final Target TXT_FECHA_INGRESO = Target.the("la fecha de ingreso").located(By.id("txtFecIngr"));
    public static final Target TXT_CARGO_ACTUAL = Target.the("el cargo actual").located(By.id("txtCargoCon"));
    public static final Target TXT_TOTAL_INGRESOS = Target.the("el total de ingresos").located(By.id("txtTIngCon"));
    public static final Target TXT_TOTAL_EGRESOS = Target.the("el total de egresos").located(By.id("txtTEgrCon"));
    public static final Target TXT_NOMBRE_EPS = Target.the("el nombre de la eps").located(By.id("txtEpsConyuge"));
    public static final Target LST_NIVEL_ESTUDIOS = Target.the("el nivel de estudios").located(By.id("cmbNivelEstCon"));
    public static final Target TXT_CELULAR = Target.the("el numero del celular").located(By.id("txtCelCon"));
    public static final Target FILTRO_LUGARES= Target.the("el lugar de expedicion").located(
       By.xpath("//div[contains(@class,'disabled input-form open')]//input[@class='form-control requerir']"));
    public static final Target FILTRO_LUGAR_NACIMIENTO= Target.the("el lugar de expedicion").located(By.xpath("//button[@data-id='txtLugarNacCon']//following-sibling::div//input"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_5"));

    private FormularioSolicitudPaso5Page() {
        throw new IllegalStateException("Utility class");
    }
}
