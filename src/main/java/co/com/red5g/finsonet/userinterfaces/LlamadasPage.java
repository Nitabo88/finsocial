package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LlamadasPage {
    public static final Target MNU_HAMBURGER = Target.the("menu de acceso modulo llamadas").located(By.id("hamburger"));
    public static final Target CHK_ID_LLAMADAS = Target.the("menu de acceso modulo llamadas").locatedBy("//input[@id='chk-{0}']");
    public static final Target BTN_ASIGNACION_LIBRANZA = Target.the("boton de asignacion credito libranza").located(By.id("botonLibranza"));
    public static final Target BTN_ASIGNACION_HUY= Target.the("boton de asignacion credito huy").located(By.id("botonHuy"));



}
