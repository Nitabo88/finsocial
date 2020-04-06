package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class ChequeoDocumentosPage {

    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA = Target.the("la fila de la tabla")
        .locatedBy("//td[text()='Libranza']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]//parent::td//parent::tr");
    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS_PENDIENTE = Target.the("la fila de la tabla documentos pendiente")
        .locatedBy("//table[@id='table_p']//a[@class='faq-link'][contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA = Target.the("la opcion de la tabla del nombre")
        .locatedBy("//td[text()='Libranza']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target TXT_PUNTAJE_CIFIN = Target.the("el puntaje de la CIFIN").located(By.id("txtCifin"));
    public static final Target TXT_ACIERTA_DATACREDITO = Target.the("acierta datacredito").located(By.id("txtDatacredito"));
    public static final Target BTN_PAPELERIA = Target.the("el boton  de papeleria").locatedBy("//p[text()='{0}']");
    public static final Target BTN_ACEPTAR1_POP_UP = Target.the("el boton aceptar del primer pop up").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR2_POP_UP = Target.the("el boton aceptar del segundo pop up").located(By.id("btn-aceptar-2"));
    public static final Target LST_CODIGO_PAPELERIA = Target.the("el codigo de papeleria").located(By.id("codPapeleria"));
    public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target BTN_MODIFICAR_CREDITO = Target.the("el boton modificar credito").located(By.id("btn_Dif"));
    public static final Target BTN_ACEPTAR_HUY = Target.the("el boton aceptar de papeleria del credito huy").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR_ACCION_HUY = Target.the("el boton aceptar de aviso de papeleria del credito huy").located(By.xpath("//button[@class='btn btn-light-blue']"));
    public static final Target BTN_GUARDAR = Target.the("el boton guardar").located(By.xpath("//button[contains(.,'Guardar')]"));
    public static final Target BTN_GUARDAR_DATOS = Target.the("el boton guardar").located(By.id("btnGuardar"));
    public static final Target LBL_MENSAJE = Target.the("el mensaje de advertencia").located(
        org.openqa.selenium.By.xpath("//div[@class='swal2-popup swal2-modal popup-class swal2-show']//p[@class='p-sweet']"));
    public static final Target BTN_PENDIENTE_CHEQUEO_DOCUMENTOS = Target.the("Boton de estado en chequeo de documentos")
        .locatedBy("//tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]//parent::td//parent::tr//child::td//*[@id='boton']");
    public static final Target LST_MOTIVO = Target.the("Lista de motivos en chequeo de documentos").located(By.id("motivo"));
    public static final Target TXT_AREA = Target.the("El detalle del motivo").located(By.id("area"));
    public static final Target BTN_ENVIAR = Target.the("Enviar motivo en chequeo de documentos").located(By.id("boton2"));
    public static final Target BTN_OK = Target.the("boton OK").located(By.xpath("//button[contains(.,'OK')]"));
    public static final Target BTN_UPLOAD = Target.the("icono de cargar").located(By.xpath("//i[contains(@class,'fa-upload')]"));
    public static final Target LNK_FILE_UPLOAD = Target.the("el input del archivor").located(By.id("fileUpload"));
    public static final Target BTN_CERRAR = Target.the("Enviar motivo en chequeo de documentos").located(
        org.openqa.selenium.By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target BTN_CERRAR_POP_UP = Target.the("Cerrar pop up").located(By.xpath("//a[@title='Close']"));
    public static final Target LBL_CHEQUEO_DOCUMENTOS = Target.the("El texto de la pantalla chequeo de documentos").located(By.xpath("//h3[text()='Chequeo de Documentos']"));
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO = Target.the("la opcion de la tabla del nombre")
        .locatedBy("//td[text()='Finsoamigo']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY = Target.the("la opcion de la tabla del nombre")
        .locatedBy("//td[text()='CrediHuy']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");

    private ChequeoDocumentosPage() {
        throw new IllegalStateException("Utility class");
    }
}