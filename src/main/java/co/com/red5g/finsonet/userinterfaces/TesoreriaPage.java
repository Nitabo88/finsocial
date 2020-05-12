package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TesoreriaPage {

    public static final Target LST_FILA_TESORERIA_LIBRANZA = Target.the("la lista de tesoreria").locatedBy("//tbody[@id='tablaLib']//td[text()='{0}']//parent::tr");
    public static final Target LST_FILA_TESORERIA_FINSOAMIGO = Target.the("la lista de tesoreria de finsoamigo").locatedBy("//tbody[@id='tablaAmigo']//td[text()='{0}']//parent::tr");
    public static final Target LST_FILA_TESORERIA_FINSOAMIGO1 = Target.the("la lista de tesoreria de finsoamigo temporal").locatedBy("//tbody[@id='tablaAmigo']//p[text()='COMPLETO']//ancestor::tr//td");
    public static final Target LST_FILA_TESORERIA_HUY = Target.the("la lista de tesoreria de credihuy").locatedBy("//tbody[@id='tablaHuy']//td[text()='{0}']//parent::tr");
    public static final Target LST_FILA_TESORERIA_PENDIENTE = Target.the("la lista pendientes de tesoreria").locatedBy("//div[@id='fixed-table-container-2']//td[text()='{0}']//parent::tr");
    public static final Target LST_NOMBRE_TESORERIA_LIBRANZA = Target.the("la columna nombre de tesoreria").locatedBy("//tbody[@id='tablaLib']//td[text()='{0}']//parent::tr//a[@href='formOrig.php?crid={0}']");
    public static final Target LST_NOMBRE_TESORERIA_FINSOAMIGO = Target.the("la columna nombre de tesoreria finsoamigo").locatedBy("//tbody[@id='tablaAmigo']//td[text()='{0}']//parent::tr//a[@href='formOrig.php?crid={0}']");
    public static final Target BTN_ACCION_TESORERIA = Target.the("el boton accion de tesoreria").locatedBy("//td[text()='{0}']//parent::tr//button[@data-original-title='{1}']");
    public static final Target LST_SOLICITADO_POR = Target.the("la lista de quien solicita el regreso").locatedBy("#txtAut");
    public static final Target TXT_MOTIVO = Target.the("el motivo del regreso").locatedBy("#txtMotivo");
    public static final Target TXT_DETALLE = Target.the("el detalle de marcar como pendiente").locatedBy("#txtDetalle2");
    public static final Target LST_MOTIVO = Target.the("el motivo de que el credito quede como pendiente").locatedBy("#txtMotivo2");
    public static final Target BTN_REGISTRAR = Target.the("el boton de registro del regreso").locatedBy("#btn-aceptar-regreso");
    public static final Target BTN_REGISTRAR_PENDIENTE = Target.the("el boton de registro de pendiente").locatedBy("#btn-aceptar-pendiente");
    public static final Target BTN_ACEPTAR = Target.the("el boton Ok").located(By.xpath("//button[text()='Aceptar']"));
    public static final Target BTN_ENVIAR_ANTECARTERA = Target.the("el boton enviar antecartera").located(By.xpath("//button[contains(text(), 'Enviar Ante Cartera')]"));
    public static final Target BTN_ENVIAR = Target.the("el boton enviar").located(By.xpath("//button[@class='btn btn-warning boton_planilla']"));
    public static final Target LST_PAGADURIA = Target.the("la pagaduria").located(By.id("textoPagadura"));
    public static final Target LST_TIPO_GIRO = Target.the("el tipo de giro").located(By.id("t_giro"));
    public static final Target TXT_CUOTA_RETENIDA = Target.the("la cuota retenida").located(By.id("textoCuotaRet1"));
    public static final Target LBL_VALOR_GIRO = Target.the("el valor del giro").located(By.id("tdVlrGiro"));

    private TesoreriaPage() {
        throw new IllegalStateException("Utility class");
    }
}
