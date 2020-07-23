package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlamadasPage {

    public static final Target CHK_ID_LLAMADAS_LIBRANZA = Target.the("checkbok del credito de libranza").locatedBy("//td[text()='libranza']//parent::tr//input[@id='chk-{0}']");
    public static final Target CHK_ID_LLAMADAS_CREDIHUY= Target.the("checkbok del credito Huy").locatedBy("//td[text()='credihuy']//parent::tr//input[@id='chk-{0}']");
    public static final Target CHK_ID_LLAMADAS_FINSOAMIGO = Target.the("checkbok del credito finsoamigo").locatedBy("//td[text()='FinsoAmigo']//parent::tr//input");
    public static final Target BTN_ASIGNACION_LIBRANZA = Target.the("boton de asignacion credito libranza").located(By.id("botonLibranza"));
    public static final Target BTN_ASIGNACION_FINSOAMIGOS = Target.the("boton de asignacion credito libranza").located(By.id("botonFinsoAmigos"));
    public static final Target BTN_ASIGNACION_HUY = Target.the("boton de asignacion credito huy").located(By.id("botonHuy"));
    public static final Target BTN_ACEPTAR = Target.the("menu de acceso modulo llamadas").locatedBy("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']");
    public static final Target LST_FILA_LLAMADAS = Target.the("la fila de llamadas asignadas").locatedBy("//tr[@id='listLlamadas-{0}']//span[@class='fas fa-phone-alt']");
    public static final Target MNU_HAMBURGUESA_LLAMADAS = Target.the("menu hamburguesa llamadas").located(By.id("hamburger"));
    public static final Target MNU_LLAMADAS = Target.the("submenu llamadas").locatedBy("//a[contains(text(),'{0}')]");

    private LlamadasPage() {
        throw new IllegalStateException("Utility class");
    }
}
