package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioSolicitudPaso2Page {
    public static final Target TXT_PRIMER_APELLIDO= Target.the("el primer apellido").located(By.id("txtPApellido"));
    public static final Target TXT_SEGUNDO_APELLIDO= Target.the("el segundo apellido").located(By.id("txtSApellido"));
    public static final Target TXT_PRIMER_NOMBRE= Target.the("el primer nombre").located(By.id("txtPNombre"));
    public static final Target TXT_SEGUNDO_NOMBRE= Target.the("el segundo nombre").located(By.id("txtSNombre"));
    public static final Target LST_TIPO_DOCUMENTO= Target.the("el tipo de documento").located(By.id("cmbTipoDoc"));
    public static final Target TXT_NUMERO_DOCUMENTO= Target.the("el numero de documento").located(By.id("txtNoDoc"));
    public static final Target LST_LUGAR_EXPEDICION= Target.the("el lugar de expedicion").located(By.id("txtLugarExp"));
    public static final Target TXT_FECHA_EXPEDICION= Target.the("la fecha de expedicion").located(By.id("txtFechaExp"));
    public static final Target TXT_FECHA_NACIMIENTO= Target.the("la fecha de nacimiento").located(By.id("txtFechaNac"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_2"));
    public static final Target BTN_REGRESAR= Target.the("el boton regresar").located(By.id("btnRegresar_2"));
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
    public static final Target LST_NIVEL_ESTUDIOS = Target.the("el nivel de estudios").located(By.id("cmbNivelEst"));
    public static final Target LST_PROFESION = Target.the("la profesion").located(By.id("cmbProfesion"));
    public static final Target TXT_DIRECCION = Target.the("la direccion").located(By.id("dirCa"));
    public static final Target LST_CORRESPONDENCIA = Target.the("la correspondencia").located(By.id("cmbCorrespondencia"));

    private FormularioSolicitudPaso2Page() {
        throw new IllegalStateException("Utility class");
    }

}
