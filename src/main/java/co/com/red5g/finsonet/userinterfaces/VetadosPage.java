package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://192.168.0.48:82/vetados/vetoInterno.php")

public class VetadosPage extends PageObject {

    public static final Target BTN_ACEPTAR_VETO = Target.the("boton aceptar veto").locatedBy(("//div[@class='swal2-actions actions-class']//button[contains(.,'Aceptar')]"));
    public static final Target MNM_RIESGOS = Target.the("Menu de riesgo").located(By.id("hamburger"));
    public static final Target MNM_LST_VETADOS = Target.the("Menu lista de vetados").located(By.id("listado-vetados"));
    public static final Target TXT_DOCUMENTO_VETADOS = Target.the("input de documento a realizar nuevo veto").located(By.id("txtDocumento"));
    public static final Target LST_MOTIVO = Target.the("lista de motivos para nuevo veto").located(By.id("txtMotivo"));
    public static final Target TXT_DETALLE = Target.the("detalle del nuevo vetados").located(By.id("txtDetalle"));
    public static final Target BTN_NUEVO_VETO = Target.the("boton agregar nuevo veto").located(By.id("addVeto"));
    public static final Target LST_FILA_VETOS = Target.the("La fila de clientes vetados").locatedBy("//tr[@class='tableResult'][contains(.,'{0}')]");
}
