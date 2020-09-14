package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChequeoDocumentosPage {

    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA = Target.the("la fila de la tabla")
        .locatedBy("//td[text()='Libranza']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]//parent::td//parent::tr");
    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS_PENDIENTE = Target.the("la fila de la tabla documentos pendiente")
        .locatedBy("//table[@id='table_p']//a[@class='faq-link'][contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA = Target.the("la columna nombre de la tabla de libranza")
        .locatedBy("//td[text()='Libranza']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target TXT_PUNTAJE_CIFIN = Target.the("el puntaje de la CIFIN").located(By.id("txtCifin"));
    public static final Target TXT_ACIERTA_DATACREDITO = Target.the("acierta datacredito").located(By.id("txtDatacredito"));
    public static final Target BTN_PAPELERIA = Target.the("el boton  de papeleria").locatedBy("//p[text()='{0}']");
    public static final Target BTN_ACEPTAR1_POP_UP = Target.the("el boton aceptar del primer pop up").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR2_POP_UP = Target.the("el boton aceptar del segundo pop up").located(By.id("btn-aceptar-2"));
    public static final Target LST_CODIGO_PAPELERIA = Target.the("el codigo de papeleria").located(By.id("codPapeleria"));
    public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target BTN_FORMULARIO_SOLICITUD = Target.the("el boton formulario de solicitud").located(By.xpath("//a[text()='Formulario de solicitud']"));
    public static final Target BTN_ACEPTAR2 = Target.the("el boton aceptar 2").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-danger swal2-styled']"));
    public static final Target BTN_MODIFICAR = Target.the("el boton modificar credito").located(By.id("btn_Dif"));
    public static final Target LBL_VALOR_A_GIRAR = Target.the("el valor a girar").located(By.id("tdVlrGiro"));
    public static final Target BTN_OK_MODIFICACION = Target.the("el boton modificar credito").located(By.xpath("//button[@class='confirm']"));
    public static final Target BTN_ACEPTAR_HUY = Target.the("el boton aceptar de papeleria del credito huy").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR_ACCION_HUY = Target.the("el boton aceptar de aviso de papeleria del credito huy").located(By.xpath("//button[@class='btn btn-light-blue']"));
    public static final Target BTN_GUARDAR = Target.the("el boton guardar").located(By.xpath("//button[contains(.,'Guardar')]"));
    public static final Target BTN_GUARDAR_DATOS = Target.the("el boton guardar").located(By.id("btnGuardar"));
    public static final Target LBL_MENSAJE = Target.the("el mensaje de advertencia").located(
            org.openqa.selenium.By.xpath("//div[@class='swal2-popup swal2-modal popup-class swal2-show']//p[@class='p-sweet']"));
    public static final Target BTN_PENDIENTE_CHEQUEO_DOCUMENTOS_LIBRANZA = Target.the("Boton de estado en chequeo de documentos")
            .locatedBy("//td[text()='Libranza']//parent::tr//a[contains(@href,'{0}')]//parent::td//parent::tr//child::td//*[@id='boton']");
    public static final Target LST_MOTIVO = Target.the("Lista de motivos en chequeo de documentos").located(By.id("motivo"));
    public static final Target LST_MOTIVO_NEGACION = Target.the("Lista de motivos en chequeo de documentos").located(By.id("txtMotivo"));
    public static final Target TXT_AREA = Target.the("El detalle del motivo").located(By.id("area"));
    public static final Target TXT_DETALLE = Target.the("la razon de la negacion").located(By.id("txtDetalle"));
    public static final Target BTN_ENVIAR = Target.the("Enviar motivo en chequeo de documentos").located(By.id("boton2"));
    public static final Target BTN_OK = Target.the("boton OK").located(By.xpath("//button[contains(.,'OK')]"));
    public static final Target BTN_NEGAR = Target.the("boton negar").located(By.id("btnRech"));
    public static final Target BTN_NEGAR_LIBRANZA = Target.the("boton negar").located(By.xpath("//button[contains(text(),'Negar')]"));
    public static final Target BTN_ENVIAR_NEGACION = Target.the("boton enviar negacion").located(By.id("botonRechazoChequeo"));
    public static final Target BTN_ACEPTAR_NEGACION = Target.the("boton aceptar negacion")
            .located(By.xpath("//button[@id='btn-aceptar-negar'][@class='btn confirm-button-class-danger']"));
    public static final Target BTN_UPLOAD = Target.the("icono de cargar").located(By.xpath("//i[@class='fas fa-upload white']"));
    public static final Target BTN_UPLOAD_FINSOAMIGO = Target.the("icono de cargar").located(By.xpath("//div[@id='documentos-chequeo']//table[@class='table-incorporacion br-right mb-30']//i[@class='fas fa-upload white']"));
    public static final Target BTN_UPLOAD_HUY = Target.the("icono de cargar Huy").located(By.xpath("//i[@class='fa fa-upload']"));
    public static final Target LNK_FILE_UPLOAD = Target.the("el input del archivor").located(By.id("fileUpload"));
    public static final Target BTN_CERRAR = Target.the("Enviar motivo en chequeo de documentos").located(
            org.openqa.selenium.By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target BTN_CERRAR_POP_UP = Target.the("Cerrar pop up").located(By.xpath("//a[@title='Close']"));
    public static final Target LBL_CHEQUEO_DOCUMENTOS = Target.the("El texto de la pantalla chequeo de documentos").located(By.xpath("//h3[text()='Chequeo de Documentos Libranza Digital']"));
    public static final Target LBL_CHEQUEO_DOCUMENTOS_NEGADO = Target.the("El texto de negado chequeo de documentos").located(By.xpath("//p[contains(text(),'Crédito negado.')]"));
    public static final Target LBL_LISTADO_CHEQUEO_DOCUMENTOS = Target.the("El texto de la pantalla del listado chequeo de documentos").located(By.xpath("//h1[text()='Listado de chequeo']"));
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO = Target.the("la columna nombre de la tabla de finsoamigos")
        .locatedBy("//td[text()='Finsoamigo']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY = Target.the("la columna nombre de la tabla de credihuy")
        .locatedBy("//td[text()='CrediHuy']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target BTN_PENDIENTE_CHEQUEO_DOCUMENTOS_CREDIHUY = Target.the("Boton de estado en chequeo de documentos de credihuy")
        .locatedBy("//td[text()='CrediHuy']//parent::tr//a[contains(@href,'{0}')]//parent::td//parent::tr//child::td//*[@id='boton']");
    public static final Target LST_CHEQUEO_DOCUMENTOS_LIBRANZA_DIGITAL = Target.the("la columna nombre de la tabla de libranza digital")
        .locatedBy("//td[text()='Libranza digital']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_NOMBRE_FINSOALIVIO = Target.the("la columna nombre de la tabla de finsoalivio")
        .locatedBy("//td[text()='Finsoalivio']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_NOMBRE_FINSOTIENDA = Target.the("la columna nombre de la tabla de finsotienda")
        .locatedBy("//td[text()='Finsotienda']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");
    public static final Target LST_CHEQUEO_NOMBRE_FINSOPRODUCTIVO = Target.the("la columna nombre de la tabla de finsoproductivo")
        .locatedBy("//td[text()='Finsoproductivo']//parent::tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]");

    private ChequeoDocumentosPage() {
        throw new IllegalStateException("Utility class");
    }
}