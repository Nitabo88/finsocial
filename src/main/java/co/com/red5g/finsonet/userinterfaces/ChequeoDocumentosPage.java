package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChequeoDocumentosPage {

    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS = Target.the("la fila de la tabla")
        .locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr");
    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS_PENDIENTE = Target.the("la fila de la tabla documentos pendiente")
        .locatedBy("//table[@class='table table-striped table-condensed']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr");
    public static final Target LST_COLUMNAS_CHEQUEO_DOCUMENTOS = Target.the("la opcion de la tabla")
        .locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE = Target.the("la opcion de la tabla del nombre")
        .locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td//a[contains(.,'{2}')]");
    public static final Target TXT_PUNTAJE_CIFIN = Target.the("el puntaje de la CIFIN").located(By.id("txtCifin"));
    public static final Target TXT_ACIERTA_DATACREDITO = Target.the("acierta datacredito").located(By.id("txtDatacredito"));
    public static final Target BTN_PAPELERIA_ANTIGUA = Target.the("el boton papeleria antigua").located(By.xpath("//p[contains(text(),'Papelería Antigua')]"));
    public static final Target BTN_ACEPTAR1_POP_UP = Target.the("el boton aceptar del primer pop up").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR2_POP_UP = Target.the("el boton aceptar del segundo pop up").located(By.id("btn-aceptar-2"));
    public static final Target BTN_ACTIVAL = Target.the("el boton de actival de afianzados").located(By.xpath("//p[contains(text(),'Actival')]"));
    public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target BTN_GUARDAR = Target.the("el boton guardar").located(By.xpath("//button[contains(.,'Guardar')]"));
    public static final Target LBL_MENSAJE = Target.the("el mensaje de advertencia").located(By.xpath("//div[@class='swal2-popup swal2-modal popup-class swal2-show']//p[@class='p-sweet']"));
    public static final Target BTN_PENDIENTE = Target.the("Boton de estado en chequeo de documentos")
        .locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td//*[@id='boton']");
    public static final Target LST_MOTIVO = Target.the("Lista de motivos en chequeo de documentos").located(By.id("motivo"));
    public static final Target TXT_AREA = Target.the("El detalle del motivo").located(By.id("area"));
    public static final Target BTN_ENVIAR = Target.the("Enviar motivo en chequeo de documentos").located(By.id("boton2"));
    public static final Target BTN_OK = Target.the("boton OK").located(By.xpath("//button[contains(.,'OK')]"));
    public static final Target BTN_UPLOAD = Target.the("icono de cargar").located(By.xpath("//button[contains(@data-original-title,'Subir documento')]"));
    public static final Target BTN_CERRAR = Target.the("Enviar motivo en chequeo de documentos").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));

    private ChequeoDocumentosPage() {
        throw new IllegalStateException("Utility class");
    }
}