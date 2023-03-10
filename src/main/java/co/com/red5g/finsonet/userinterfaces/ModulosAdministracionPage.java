package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class ModulosAdministracionPage {

    public static final Target LNK_COMERCIAL = Target.the("el link comercial").located(By.id("comercial"));
    public static final Target LNK_REPORTES = Target.the("el link de los reportes").located(By.id("reports"));
    public static final Target LNK_ORIGINACION = Target.the("el link de originacion").located(By.id("origin"));
    public static final Target LNK_AUXILIAR_OPERATIVO = Target.the("el link de auxiliar operativo").located(By.id("auxop"));
    public static final Target LNK_HOME = Target.the("el link de la pagina principal").located(By.xpath("//div[contains(@class,'div-logo')]//img[@class='icon icon-finsonetlogo']"));
    public static final Target LNK_CDAS = Target.the("el link de CDAS").located(By.xpath("//a[contains(@href,'cdas')]//div"));
    public static final Target BTN_MI_CUENTA = Target.the("boton de mi cuenta").located(By.id("dropdownCuenta"));
    public static final Target MNM_MI_CUENTA = Target.the("el submenu de mi cuenta").locatedBy("//div[contains(@class,'dropdown-menu')]//a[contains(.,'{0}')]");
    public static final Target IMG_FINSONET = Target.the("el logo de finsonet")
            .located(By.xpath(
                    "//div[@id='menu-content']//div[@class='text-center divlogo']//img | //div[@class='col-sm-12 col-md-3 col-lg-2 div-logo']//img[@class='icon icon-finsonetlogo']"));
    public static final Target LNK_LLAMADAS = Target.the("el logo de llamadas").located(By.id("call"));
    public static final Target LNK_EQUIPO_SATISFACCION = Target.the("el link de equipo de satisfaccion").located(By.id("juridico"));
    public static final Target LBL_MODULOS_ADMINISTRACION = Target.the("el label de modulos de administracion").located(By.xpath("//h2[text()='Módulos de Administración']"));
    public static final Target LNK_FINSOAMIGO = Target.the("el link de finsoamigos").located(By.id("finso_amigo"));

    private ModulosAdministracionPage() {
        throw new IllegalStateException("Utility class");
    }
}