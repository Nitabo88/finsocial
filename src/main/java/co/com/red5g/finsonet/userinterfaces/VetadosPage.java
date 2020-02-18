package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.0.48:82/vetados/vetoInterno.php")

public class VetadosPage extends PageObject {

    public static final Target BTN_ACEPTAR_VETO = Target.the("Checkbox CC vetados").locatedBy(("//*[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target TXT_VETADOS = Target.the("Busqueda vetados").located(By.id("txtParBusqueda"));
    public static final Target MNU_RIESGOS = Target.the("Mostrar menu vetados").located(By.id("hamburger"));
    public static final Target MNU_INTERNO = Target.the("tab veto interno").located(By.id("veto-interno"));
    public static final Target MNU_BUSQUEDA_VETADOS = Target.the("tab veto interno").located(By.id("busq-vetados"));
    public static final Target MNU_LST_VETADOS = Target.the("tab veto lista de vetados").located(By.id("listado-vetados"));
    public static final Target TXT_DOCUMENTO_VETADOS = Target.the("input text documento").located(By.id("txtDocumento"));
    public static final Target LST_MOTIVO = Target.the("lista de motivos vetados").located(By.id("txtMotivo"));
    public static final Target TXT_DETALLE = Target.the("detalle vetados").located(By.id("txtDetalle"));
    public static final Target BTN_NUEVO_VETO = Target.the("boton agregar veto").located(By.id("addVeto"));

}
