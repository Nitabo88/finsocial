package co.com.red5g.wiipo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://10.10.1.2/")

public class LoginWiipoPage extends PageObject {
    public static final Target LST_TIPO_DOCUMENTO = Target.the("lista tipo de documento").located(By.id("opcionDoc"));
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("numero de documento").located(By.id("txtusu"));
    public static final Target TXT_CONTRASENA = Target.the("ls contrasena").located(By.id("txtPass"));
    public static final Target BTN_ENTRAR = Target.the("el boton entrar").located(By.xpath("//button[text()='ENTRAR']"));
    public static final Target LBL_MENSAJE_BIENVENIDA = Target.the("el mensaje de bienvenida").located(By.xpath("//p[@class='blue--dark space-nowrap']"));
}
