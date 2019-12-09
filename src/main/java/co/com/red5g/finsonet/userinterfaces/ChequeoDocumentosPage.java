package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChequeoDocumentosPage {
    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS = Target.the("la fila de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr");
    public static final Target LST_COLUMNAS_CHEQUEO_DOCUMENTOS = Target.the("la opcion de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE= Target.the("la opcion de la tabla del nombre").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td//a[contains(.,'{2}')]");
    public static final Target TXT_PUNTAJE_CIFIN = Target.the("el puntaje de la CIFIN").located(By.id("txtCifin"));
    public static final Target TXT_ACIERTA_DATACREDITO = Target.the("acierta datacredito").located(By.id("txtDatacredito"));
    public static final Target BTN_PAPELERIA_ANTIGUA = Target.the("el boton papeleria antigua").located(By.xpath("//p[contains(text(),'Papelería Antigua')]"));
    public static final Target BTN_ACEPTAR1_POP_UP = Target.the("el boton aceptar").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR2_POP_UP = Target.the("el boton aceptar").located(By.id("btn-aceptar-2"));
    public static final Target BTN_ACTIVAL = Target.the("el boton de actival de afianzados").located(By.xpath("//p[contains(text(),'Actival')]"));
    public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target BTN_GUARDAR = Target.the("el boton aceptar").located(By.xpath("//button[contains(.,'Guardar')]"));
    public static final Target LBL_MENSAJE = Target.the("el mensaje de advertencia").located(By.xpath("//div[@class='swal2-popup swal2-modal popup-class swal2-show']//p[@class='p-sweet']"));
    public static final Target BTN_PENDIENTE = Target.the("Boton de estado en chequeo de documentos").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td//*[@id='boton']");
    public static final Target LST_MODAL_DEFAULT = Target.the("Clickear en lista de motivos en chequeo de documentos").located(By.id("motivo") );
    public static final Target LST_MODAL_CHECK1 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 2").locatedBy("//*[@id=\"motivo\"]/option[2]");
    public static final Target LST_MODAL_CHECK2 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 3").locatedBy("//*[@id=\"motivo\"]/option[3]");
    public static final Target LST_MODAL_CHECK3 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 4").locatedBy("//*[@id=\"motivo\"]/option[4]");
    public static final Target LST_MODAL_CHECK4 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 5").locatedBy("//*[@id=\"motivo\"]/option[5]");
    public static final Target LST_MODAL_CHECK5 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 6").locatedBy("//*[@id=\"motivo\"]/option[6]");
    public static final Target BTN_MODAL_ENVIAR = Target.the("Enviar motivo en chequeo de documentos").located(By.id("boton2") );
    public static final Target UPLOAD_ICON = Target.the("Enviar motivo en chequeo de documentos").locatedBy("//tr[@id='{0}']//button[@class='bg-square-button white bg-green']");
    public static final Target UPLOAD = Target.the("Enviar motivo en chequeo de documentos").located(By.xpath("//input[@type='file']") );
    public static final Target BTN_CERRAR = Target.the("Enviar motivo en chequeo de documentos").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));

    private ChequeoDocumentosPage() {
        throw new IllegalStateException("Utility class");
    }
}
