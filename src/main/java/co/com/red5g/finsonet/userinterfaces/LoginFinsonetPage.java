package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.0.18:81/index.php")

public class LoginFinsonetPage extends PageObject {
    public static final Target TXT_USUARIO = Target.the("usuario").located(By.name("user"));
    public static final Target TXT_CONTRASENA = Target.the("contraseña").located(By.name("pass"));
    public static final Target BTN_ACCESO = Target.the("el boton iniciar sesion").located(By.id("butSubmit"));
    public static final Target TXT_CODIGO = Target.the("codigo").located(By.id("codigo"));
    public static final Target BTN_ENVIAR = Target.the("el boton enviar").located(By.id("butSubmit"));
    public static final Target LBL_MENSAJE_BIENVENIDA = Target.the("el mensaje de bienvenido").located(By.xpath("//p[contains(.,'Bienvenido')]"));
}