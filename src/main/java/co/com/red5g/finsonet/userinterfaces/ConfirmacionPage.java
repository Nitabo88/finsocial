package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionPage {

    public static final Target LST_FILA_CONFIRMACION = Target.the("la fila de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]");
    public static final Target BTN_ACCION = Target.the("el boton de accion")
        .locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//button[@class='btn btn-primary dropdown-toggle dropdown-toggle-split']");
    public static final Target MNU_ACCION = Target.the("el menu de acciones de confirmacion").locatedBy("//div[@class='btn-group open']//div[@class='dropdown-menu']//a[contains(.,'{0}')]");
    public static final Target BTN_OK = Target.the("el boton ok de confirmacion").located(By.xpath("//button[@class='confirm']"));
    public static final Target TXT_MOTIVO = Target.the("motivo de regresar el credito").located(By.xpath("//input[@placeholder='Motivo']"));

    private ConfirmacionPage() {
        throw new IllegalStateException("Utility class");
    }
}