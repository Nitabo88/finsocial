package co.com.red5g.finsonet.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioSolicitudPaso3Page {
    public static final Target RBN_DECLARA_RENTA = Target.the("la opcion de declara renta").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='txtDeRenta']");
    public static final Target RBN_OCUPACION = Target.the("la opcion de ocupacion").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='rdOcupacion']");
    public static final Target RBN_IMPACTO_CARGO = Target.the("la opcion de influencia del cargo para la sociedad").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='txtDesicionCargo']");
    public static final Target RBN_RECURSOS_PUBLICOS = Target.the("la opcion de si maneja recursos publicos").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='txtrecPublicos']");
    public static final Target RBN_PERSONAJE_PUBLICO = Target.the("la opcion de si es un personaje publico").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='txtPerPubl']");
    public static final Target LST_OPCIONES = Target.the("las opciones de lista").located(By.xpath("//div[contains(@class,'input-form pen requerir open')]//div[@class='dropdown-menu open']"));
    public static final Target FILTRO_LISTA= Target.the("el lugar de expedicion").locatedBy("//div[contains(@class,'pen dropup requerir open')]//input[@class='form-control']");
    public static final Target BTN_EMPRESA = Target.the("la empresa donde trabaja").located(By.xpath("//button[@data-id='txtEmpresa']"));
    public static final Target TXT_CARGO = Target.the("el cargo").located(By.id("txtCargo"));
    public static final Target TXT_DIRECCION_TRABAJO = Target.the("la opcion de declara renta").located(By.id("dirTrabajo"));
    public static final Target TXT_FECHA_VINCULACION = Target.the("la fecha de vinculacion").located(By.id("txtFechaVinculacion"));
    public static final Target TXT_NIT_EMPRESA = Target.the("el NIT de la empresa").located(By.id("txtNitEmpresa"));
    public static final Target BTN_TIPO_EMPRESA = Target.the("el tipo de empresa").located(By.xpath("//button[@data-id='cmbTipoEmp']"));
    public static final Target BTN_TIPO_CONTRATO = Target.the("el tipo de contrato").located(By.xpath("//button[@data-id='cmbTipoContrato']"));
    public static final Target BTN_ACTIVIDAD_ECONOMICA = Target.the("el tipo de empresa").located(By.xpath("//button[@data-id='cmbActEcon']"));
    public static final Target BTN_CIUDAD_TRABAJO = Target.the("la ciudad de trabajo").located(By.xpath("//button[@data-id='cmbCiudad2']"));
    public static final Target TXT_TELEFONO_TRABAJO = Target.the("la telefono del trabajo").located(By.id("txtTelEmpresa"));
    public static final Target TXT_EXTENSION = Target.the("la extension del trabajo").located(By.id("txtExt"));
    public static final Target BTN_CERRAR_DIRECCION = Target.the("cerrar direccion del trabajo").located(By.xpath("//button[@class='btn btn-default']"));
    public static final Target BTN_REGRESAR = Target.the("al boton regresar").located(By.id("btnRegresar_3"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_3"));

    private FormularioSolicitudPaso3Page() {
        throw new IllegalStateException("Utility class");
    }
}