package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CdasPage {
    public static final Target RBN_CRITERIO_BUSQUEDA = Target.the("el criterio de busqueda")
        .locatedBy("//div[@class='grid-criterio']//label[contains(.,'{0}')]");
    public static final Target TXT_VALOR_BUSQUEDA = Target.the("el valor de busqueda")
        .locatedBy("#txtParBusqueda");
    public static final Target BTN_BUSQUEDA = Target.the("el boton de busqueda")
        .locatedBy("#btn-parametro-busqueda");
    public static final Target BTN_DETALLE_GESTION = Target.the("el boton del detalle de gestion")
        .locatedBy("#btn-ver-gestion-{0}");
    public static final Target BTN_ACCION_VOBO = Target.the("el boton de VoBo")
        .located(By.xpath("//tr[@id='gr-2']//i[@class='fas fa-thumbs-up']"));
    public static final Target BTN_ACCION_DOCUMENTACION = Target.the("el boton de documentacion")
        .located(By.xpath("//tr[@id='gr-4']//i[@class='fas fa-thumbs-up']"));
    public static final Target BTN_ACCION_CERTIFICACIONES = Target.the("el boton de certificaciones")
        .located(By.xpath("//tr[@id='gr-5']//i[@class='fas fa-thumbs-up']"));
    public static final Target LST_SELECCIONAR_GESTION = Target.the("la lista de seleccionar gestion")
        .locatedBy("#txtTipoGestion");
    public static final Target TXT_MOTIVO_GESTION = Target.the("el motivo de gestion")
        .locatedBy("#actMotivo2");
    public static final Target BTN_REGISTRAR = Target.the("el boton de registrar")
        .locatedBy("#btn-cerrar-gestion");
    public static final Target BTN_CERRAR = Target.the("el boton de cerrar")
        .located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
    public static final Target LBL_GESTION_DOCUMENTAL = Target.the("el label de gestion documental")
        .locatedBy("//button[@id='btn-ver-gestion-{0}']//parent::div");
}