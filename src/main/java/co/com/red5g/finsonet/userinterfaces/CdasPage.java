package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CdasPage {
    public static final Target RDB_CRITERIO_BUSQUEDA = Target.the("el criterio de busqueda")
        .locatedBy("//div[@class='grid-criterio']//label[contains(.,'{0}')]");
    public static final Target TXT_VALOR_BUSQUEDA = Target.the("el valor de busqueda")
        .located(By.xpath("//input[@id='txtParBusqueda']"));
    public static final Target BTN_BUSQUEDA = Target.the("el boton de busqueda")
        .locatedBy("#btn-parametro-busqueda");
    public static final Target BTN_DETALLE_GESTION = Target.the("el boton del detalle de gestion")
        .locatedBy("#btn-ver-gestion-{0}");
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
    public static final Target FRM_REQUISITOS_GIRO = Target.the("El pop up de accion de cdas")
        .locatedBy("//div[@id='swal2-content']//p[contains(.,'{0}')]//following-sibling::p");
    public static final Target BTN_ACCION = Target.the("el boton de accion")
        .locatedBy("//button[@data-id='{0}']");
    public static final Target BTN_ATRAS = Target.the("el boton atras")
        .locatedBy("#btn-back");
    public static final Target BTN_ACCION_GESTION = Target.the("el boton accion gestion")
        .located(By.xpath("//button[@class='bg-square-button white bg-green']"));
    public static final Target LBL_ESTADO_ACTUAL = Target.the("el estado del credito")
            .locatedBy("//td[text()='{0}']//parent::tr");


    private CdasPage() {
        throw new IllegalStateException("Utility class");
    }
}