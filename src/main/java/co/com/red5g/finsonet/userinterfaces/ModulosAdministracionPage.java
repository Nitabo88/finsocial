package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModulosAdministracionPage {
    public static final Target LNK_COMERCIAL = Target.the("el link comercial").located(By.id("comercial"));
    public static final Target LNK_REPORTES = Target.the("el link de los reportes").located(org.openqa.selenium.By.id("reports"));
    public static final Target LNK_ORIGINACION = Target.the("el link de originacion").located(org.openqa.selenium.By.id("origin"));
    public static final Target LNK_AUXILIAR_OPERATIVO = Target.the("el link de auxiliar operativo").located(org.openqa.selenium.By.id("auxop"));
    public static final Target LNK_HOME = Target.the("el link de la pagina principal").located(org.openqa.selenium.By.xpath("//a[@class='col-md-2']//img[@class='icon icon-finsonetlogo']"));
    public static final Target BTN_MI_CUENTA = Target.the("boton de mi cuenta").located(org.openqa.selenium.By.id("dropdownCuenta"));
    public static final Target MNU_MI_CUENTA = Target.the("el submenu de mi cuenta").locatedBy("//div[contains(@class,'dropdown-menu')]//a[contains(.,'{0}')]");
    public static final Target IMG_FINSONET = Target.the("el logo de finsonet").located(org.openqa.selenium.By.xpath("//a[@class='col-md-2]//img[@class='icon icon-finsonetlogo']"));

    private ModulosAdministracionPage() {
        throw new IllegalStateException("Utility class");
    }
}