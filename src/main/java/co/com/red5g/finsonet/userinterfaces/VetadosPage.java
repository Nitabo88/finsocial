package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.0.48:82/vetados/vetoInterno.php")

public class VetadosPage extends PageObject {

    public static final Target CHK_NIT_VETADOS = Target.the("Checkbox nit vetados").located(By.xpath("//*[@id=\"checkboxes\"]/label[1]/span"));
    public static final Target CHK_CC_VETADOS = Target.the("Checkbox CC vetados").located(By.xpath("//*[@id=\"checkboxes\"]/label[2]/span"));
    public static final Target TXT_VETADOS = Target.the("Busqueda vetados").located(By.id("txtParBusqueda"));
    public static final Target HBG_RIESGOS = Target.the("Mostrar menu vetados").located(By.id("hamburger"));
    public static final Target TAB_INTERNO = Target.the("tab veto interno").located(By.id("veto-interno"));
    public static final Target TAB_LST_VETADOS = Target.the("tab veto lista de vetados").located(By.id("listado-vetados"));
    public static final Target TXT_DOCUMENTO_VETADOS = Target.the("input text documento").located(By.id("txtDocumento"));
    public static final Target LST_TXT_MOTIVO = Target.the("tab veto lista de vetados").located(By.id("txtMotivo"));
    public static final Target TXT_DETALLE = Target.the("tab veto lista de vetados").located(By.id("txtDetalle"));
    public static final Target BTN_NUEVO_VETO = Target.the("tab veto lista de vetados").located(By.id("addVeto"));

}
