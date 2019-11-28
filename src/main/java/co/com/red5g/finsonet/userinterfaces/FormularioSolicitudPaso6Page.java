package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioSolicitudPaso6Page {
    public static final Target TXT_NOMBRE_APELLIDO_FAMILIAR = Target.the("el nombre y apellido de un familiar (Que no vive con usted)").located(By.id("ref_familiar_nombre"));
    public static final Target TXT_PARENTESCO_FAMILIAR = Target.the("el parentesco que tiene el familiar)").located(By.id("ref_familiar_par"));
    public static final Target TXT_TELEFONO_FAMILIAR = Target.the("el numero de telefono de la referencia familiar").located(By.id("ref_familiar_tel"));
    public static final Target BTN_CIUDAD_FAMILIAR = Target.the("la ciudad de la referencia familiar").located(By.xpath("//button[@data-id='cmbCiudadRefFam']"));
    public static final Target BTN_CIUDAD_REFERENCIA_PERSONAL = Target.the("la ciudad de la referencia personal").located(By.xpath("//button[@data-id='cmbCiudadRefPer']"));
    public static final Target LST_CIUDAD_REFERENCIA_FAMILIAR = Target.the("la ciudad de la referencia familiar").located(By.xpath("//button[@data-id = 'cmbCiudadRefFam']//following-sibling::div//input"));
    public static final Target LST_CIUDAD_REFERENCIA_PERSONAL = Target.the("la ciudad de la referencia familiar").located(By.xpath("//button[@data-id = 'cmbCiudadRefPer']//following-sibling::div//input"));
    public static final Target TXT_CELULAR_FAMILIAR = Target.the("el numero celular de la referencia familiar").located(By.id("txtCelRFam"));
    public static final Target TXT_NOMBRE_APELLIDO_REFERENCIA_PERSONAL = Target.the("el nombre y apellido de una referencia personal (Que no vive con usted)").located(By.id("ref_personal_nombre"));
    public static final Target TXT_PARENTESCO_REFERENCIA_PERSONAL = Target.the("el parentesco que tiene la referencia personal)").located(By.id("ref_personal_par"));
    public static final Target TXT_TELEFONO_REFERENCIA_PERSONAL = Target.the("el numero de telefono de la referencia personal").located(By.id("ref_personal_tel"));
    public static final Target TXT_CELULAR_REFERENCIA_PERSONAL = Target.the("el numero celular de la referencia personal").located(By.id("txtCelRPer"));
    public static final Target TXT_DIRECCION_REFERENCIA_PERSONAL = Target.the("la direccion de la referencia personal").located(By.id("dirPersonal"));
    public static final Target TXT_DIRECCION_REFERENCIA_FAMILIAR = Target.the("la direccion de la referencia familiar").located(By.id("dirFamiliar"));
    public static final Target TXT_NOMBRE_ENTIDAD_FINANCIERA = Target.the("el nombre de la entidad financiera").located(By.id("txtNEntFin"));
    public static final Target TXT_SUCURSAL = Target.the("la sucursal").located(By.id("txtSucursal"));
    public static final Target BTN_TIPO_PRODUCTO = Target.the("el tipo de producto").located(By.xpath("//button[@data-id='cmbTipoProd']"));
    public static final Target LST_TIPO_PRODUCTO = Target.the("la lista del tipo de producto").locatedBy("//div[@class='btn-group bootstrap-select input-form requerir open']");
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(By.id("btnRegresar_6"));
    public static final Target BTN_CERRAR_DIRECCION = Target.the("el boton cerrar direccion").located(By.xpath("//button[@class='btn btn-default']"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_6"));

    private FormularioSolicitudPaso6Page() {
        throw new IllegalStateException("Utility class");
    }
}