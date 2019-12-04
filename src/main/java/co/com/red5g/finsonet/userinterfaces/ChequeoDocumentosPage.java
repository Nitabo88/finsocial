package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChequeoDocumentosPage {
    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS = Target.the("la fila de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr");
    public static final Target LST_COLUMNAS_CHEQUEO_DOCUMENTOS = Target.the("la opcion de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td");
    public static final Target LST_CHEQUEO_DOCUMENTOS_NOMBRE= Target.the("la opcion de la tabla del nombre").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td//a[contains(.,'{2}')]");
    public static final Target TXT_PUNTAJE_CIFIN = Target.the("el puntaje de la CIFIN").located(By.id("txtCifin"));
    public static final Target TXT_ACIERTA_DATACREDITO = Target.the("acierta datacredito").located(By.id("txtDatacredito"));
    public static final Target BTN_PAPELERIA_ANTIGUA = Target.the("el boton papeleria antigua").located(By.className("far fa-scroll-old bg-circle-icon-x text-grey bg-grey-l activa"));
    public static final Target BTN_ACEPTAR1_POP_UP = Target.the("el boton aceptar").located(By.id("btn-aceptar-1"));
    public static final Target BTN_ACEPTAR2_POP_UP = Target.the("el boton aceptar").located(By.id("btn-aceptar-2"));
    public static final Target BTN_ACTIVAL = Target.the("el boton de actival de afianzados").located(By.id("rdAfianzado2"));
    public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.className("swal2-confirm btn confirm-button-class-danger swal2-styled"));
    public static final Target LBL_MENSAJE = Target.the("el mensaje de advertencia").located(By.className("//p[contains(text(),'Para poder continuar es necesario diligenciar y su')]"));

    private ChequeoDocumentosPage() {
        throw new IllegalStateException("Utility class");
    }
}
