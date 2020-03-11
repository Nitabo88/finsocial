package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TesoreriaPage {

    public static final Target LST_FILA_TESORERIA = Target.the("la lista de tesoreria").locatedBy("//td[text()='{0}']//parent::tr");
    public static final Target BTN_ACCION_TESORERIA = Target.the("el boton accion de tesoreria").locatedBy("//td[text()='{0}']//parent::tr//button[@data-original-title='{1}']");
    public static final Target LST_SOLICITADO_POR = Target.the("la lista de quien solicita el regreso").locatedBy("#txtAut");
    public static final Target TXT_MOTIVO = Target.the("el motivo del regreso").locatedBy("#txtMotivo");
    public static final Target TXT_DETALLE = Target.the("el detalle de marcar como pendiente").locatedBy("#txtDetalle2");
    public static final Target LST_MOTIVO = Target.the("el motivo de que el credito quede como pendiente").locatedBy("#txtMotivo2");
    public static final Target BTN_REGISTRAR = Target.the("el boton de registro del regreso").locatedBy("#btn-aceptar-regreso");
    public static final Target BTN_REGISTRAR_PENDIENTE = Target.the("el boton de registro de pendiente").locatedBy("#btn-aceptar-pendiente");
    public static final Target BTN_OK = Target.the("el boton Ok").located(By.xpath("//button[@class='confirm']"));


    private TesoreriaPage() {
        throw new IllegalStateException("Utility class");
    }
}
