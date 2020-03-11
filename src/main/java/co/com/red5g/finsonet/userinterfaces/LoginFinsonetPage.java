package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://192.168.0.48:82/index.php")

public class LoginFinsonetPage extends PageObject {

    public static final Target TXT_USUARIO = Target.the("usuario").locatedBy("#textfield");
    public static final Target TXT_CONTRASENA = Target.the("contraseña").locatedBy("#textfield2");
    public static final Target BTN_ACCESO = Target.the("el boton iniciar sesion").locatedBy("#butSubmit");
    public static final Target TXT_CODIGO = Target.the("codigo").locatedBy("#codigo");
    public static final Target BTN_ENVIAR = Target.the("el boton enviar").locatedBy("#butSubmit");
    public static final Target LBL_MENSAJE_BIENVENIDA = Target.the("el mensaje de bienvenido").located(By.xpath("//p[contains(.,'Bienvenido')]"));
}