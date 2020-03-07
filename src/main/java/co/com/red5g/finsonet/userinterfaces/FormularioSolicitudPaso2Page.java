package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormularioSolicitudPaso2Page {
    public static final Target TXT_PRIMER_APELLIDO= Target.the("el primer apellido").located(By.id("txtPApellido"));
    public static final Target TXT_SEGUNDO_APELLIDO= Target.the("el segundo apellido").located(By.id("txtSApellido"));
    public static final Target TXT_PRIMER_NOMBRE= Target.the("el primer nombre").located(By.id("txtPNombre"));
    public static final Target TXT_SEGUNDO_NOMBRE= Target.the("el segundo nombre").located(By.id("txtSNombre"));
    public static final Target BTN_TIPO_DOCUMENTO = Target.the("el tipo de documento").located(By.xpath("//button[@data-id='cmbTipoDoc']"));
    public static final Target LST_TIPO_DOCUMENTO = Target.the("la tipo de documento").locatedBy("//select[@id='cmbTipoDoc']//following-sibling::div//ul[@class='dropdown-menu inner']//li[contains(.,'{0}')]");
    public static final Target TXT_NUMERO_DOCUMENTO= Target.the("el numero de documento").located(By.id("txtNoDoc"));
    public static final Target BTN_LUGAR_EXPEDICION= Target.the("el lugar de expedicion").located(By.xpath("//button[@data-id='txtLugarExp']"));
    public static final Target BTN_SEXO= Target.the("el sexo").located(By.xpath("//button[@data-id='cmbSexo']"));
    public static final Target BTN_CIUDAD_DEPARTAMENTO= Target.the("la ciudad y departamento").located(By.xpath("//button[@data-id='cmbCiudad']"));
    public static final Target BTN_ESTADO_CIVIL= Target.the("el estado civil").located(By.xpath("//button[@data-id='cmbEstCivil']"));
    public static final Target LST_OPCIONES= Target.the("las opciones de lista").locatedBy("//div[contains(@class,'input-form requerir open')]//li[contains(.,'{0}')]");
    public static final Target BTN_LUGAR_NACIMIENTO= Target.the("el lugar de nacimiento").located(By.xpath("//button[@data-id='txtLugarNac']"));
    public static final Target BTN_TIPO_VIVIENDA= Target.the("el tipo de vivienda").located(By.xpath("//button[@data-id='cmbTipoViv']"));
    public static final Target BTN_ESTRATO= Target.the("el estrato").located(By.xpath("//button[@data-id='txtEstrato']"));
    public static final Target LST_LISTAS = Target.the("el estrato").locatedBy("//div[@class='btn-group bootstrap-select input-form requerir dropup open']//ul[@class='dropdown-menu inner']");
    public static final Target BTN_CORRESPONDENCIA= Target.the("el lugar de correspondecia").located(By.xpath("//button[@data-id='cmbCorrespondencia']"));
    public static final Target BTN_NIVEL_ESTUDIOS= Target.the("el nivel de estudios").located(By.xpath("//button[@data-id='cmbNivelEst']"));
    public static final Target BTN_PROFESION= Target.the("la profesion").located(By.xpath("//button[@data-id='cmbProfesion']"));
    public static final Target FILTRO_LUGARES= Target.the("el lugar de expedicion").locatedBy("//div[contains(@class,'requerir dropup open')]//input[@class='form-control']");
    public static final Target TXT_FECHA_EXPEDICION= Target.the("la fecha de expedicion").located(By.id("txtFechaExp"));
    public static final Target TXT_FECHA_NACIMIENTO= Target.the("la fecha de nacimiento").located(By.id("txtFechaNac"));
    public static final Target TXT_NOMBRE_ARRENDATARIO= Target.the("el nombre del arrendatario").located(By.id("txtArrend"));
    public static final Target TXT_TELEFONO_ARREDADOR= Target.the("el telefono del arrendador").located(By.id("txtTelArr"));
    public static final Target TXT_BARRIO= Target.the("el barrio").located(By.id("txtBarrio"));
    public static final Target TXT_TELEFONO_RESIDENCIA = Target.the("el telefono de residencia").located(By.id("txtTel"));
    public static final Target TXT_CELULAR = Target.the("el celular").located(By.id("txtCel"));
    public static final Target TXT_EMAIL = Target.the("el email").located(By.id("txtEmail"));
    public static final Target TXT_MESES_RESIDENCIA = Target.the("los meses de residencia").located(By.id("txtMeses"));
    public static final Target TXT_ANOS_RESIDENCIA = Target.the("los años de residencia").located(By.id("txtAnios"));
    public static final Target TXT_EPS = Target.the("el nombre de la E.P.S").located(By.id("txtEps"));
    public static final Target TXT_ADULTOS = Target.the("el numero de adultos").located(By.id("txtAdulto"));
    public static final Target TXT_MENORES_18_ANOS= Target.the("personas menores de 18 años").located(By.id("txtMenor18"));
    public static final Target TXT_DIRECCION = Target.the("la direccion").located(By.id("dirCa"));
    public static final Target BTN_CERRAR_DIRECCION = Target.the("cerrar direccion").located(By.xpath("//button[@class='btn btn-default']"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_2"));
    public static final Target BTN_REGRESAR= Target.the("el boton regresar").located(By.id("btnRegresar_2"));

    private FormularioSolicitudPaso2Page() {
        throw new IllegalStateException("Utility class");
    }

}
