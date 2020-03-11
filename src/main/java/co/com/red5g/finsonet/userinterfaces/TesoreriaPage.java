package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TesoreriaPage {

    public static final Target LST_FILA_TESORERIA = Target.the("la lista de tesoreria").locatedBy("//td[text()='{0}']//parent::tr");
    public static final Target BTN_ACCION_TESORERIA = Target.the("el boton accion de tesoreria").locatedBy("//td[text()='{0}']//parent::tr//button[@data-original-title='{1}']");
    public static final Target LST_SOLICITADO_POR = Target.the("la lista de quien solicita el regreso").locatedBy("#txtAut");
    public static final Target TXT_MOTIVO = Target.the("el motivo del regreso").locatedBy("#txtMotivo");
    public static final Target BTN_REGISTRAR = Target.the("el boton de registro del regreso").locatedBy("#btn-aceptar-regreso");

    private TesoreriaPage() {
        throw new IllegalStateException("Utility class");
    }
}
