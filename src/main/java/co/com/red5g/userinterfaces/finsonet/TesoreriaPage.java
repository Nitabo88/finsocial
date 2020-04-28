package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TesoreriaPage {

    public static final Target LST_FILA_TESORERIA = Target.the("la lista de tesoreria").locatedBy("//div[@id='fixed-table-container-1']//td[text()='{0}']//parent::tr");
    public static final Target LST_FILA_TESORERIA_FINSOAMIGO = Target.the("la lista de tesoreria de finsoamigo").locatedBy("//tbody[@id='tablaAmigo']//td[text()='{0}']//parent::tr");
    public static final Target LST_FILA_TESORERIA_PENDIENTE = Target.the("la lista pendientes de tesoreria").locatedBy("//div[@id='fixed-table-container-2']//td[text()='{0}']//parent::tr");
    public static final Target BTN_ACCION_TESORERIA = Target.the("el boton accion de tesoreria").locatedBy("//td[text()='{0}']//parent::tr//button[@data-original-title='{1}']");
    public static final Target LST_SOLICITADO_POR = Target.the("la lista de quien solicita el regreso").locatedBy("#txtAut");
    public static final Target TXT_MOTIVO = Target.the("el motivo del regreso").locatedBy("#txtMotivo");
    public static final Target TXT_DETALLE = Target.the("el detalle de marcar como pendiente").locatedBy("#txtDetalle2");
    public static final Target LST_MOTIVO = Target.the("el motivo de que el credito quede como pendiente").locatedBy("#txtMotivo2");
    public static final Target BTN_REGISTRAR = Target.the("el boton de registro del regreso").locatedBy("#btn-aceptar-regreso");
    public static final Target BTN_REGISTRAR_PENDIENTE = Target.the("el boton de registro de pendiente").locatedBy("#btn-aceptar-pendiente");
    public static final Target BTN_ACEPTAR = Target.the("el boton Ok").located(By.xpath("//button[text()='Aceptar']"));


    private TesoreriaPage() {
        throw new IllegalStateException("Utility class");
    }
}
