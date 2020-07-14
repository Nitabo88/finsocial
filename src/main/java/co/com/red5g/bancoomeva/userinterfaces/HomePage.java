package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://10.10.1.55:8085/")
public class HomePage extends PageObject {

  public static final Target BTN_SOY_COLABORADOR = Target.the("boton de colaborador").located(By.xpath("//button[contains(.,'Soy colaborador')]"));
  public static final Target LBL_BIENVENIDO = Target.the("mensaje de bienvenida").located(By.xpath("//h3[text()='¡Bienvenido/a!']"));
  public static final Target TXT_USUARIO = Target.the("usuario").located(By.id("user"));
  public static final Target TXT_CONTRASENA = Target.the("contraseña").located(By.id("pass"));
  public static final Target BTN_INGRESAR = Target.the("contraseña").located(By.id("//button[contains(text(),'Ingresar')]"));
}
